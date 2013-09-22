
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Shen
 */
public class ReversePolish
{

    public ReversePolish()
    {
    }

    public double eval(String s)
    {
        Queue<String> inputTokens = new LinkedList<>(Arrays.asList(s.split("\\s+")));
        Stack<String> stack = new Stack<>();

        while (!inputTokens.isEmpty())
        {
            String head = inputTokens.poll();
            if (TokenHelper.isValue(head))
            {
                stack.push(head);
            }
            else if (TokenHelper.isOperator(head))
            {
                // - check that we have enough values on the stack for the operator
                if (stack.size() < 2)
                {
                    throw new RuntimeException("not enough values in the stack for the operator: " + head);
                }
                else
                {
                    String value1 = stack.pop();
                    String value2 = stack.pop();
                    double res = eval(value1, value2, head);
                    stack.push(res + "");
                }
            }
            else // - it was neither a operator or a value...
            {
                throw new RuntimeException("not a valid operator or value in the string to be evaluated: " + head);
            }

        }
        if (stack.size() == 1)
        {
            return Double.parseDouble(stack.pop());
        }
        else
        {
            throw new RuntimeException("too many values in the stack: " + stack.toString());
        }
    }

    private double eval(String value1, String value2, String operator)
    {
        double val1 = Double.parseDouble(value1);
        double val2 = Double.parseDouble(value2);

        switch (operator)
        {
            case "+":
                return val2 + val1;
            case "-":
                return val2 - val1;
            case "*":
                return val2 * val1;
            case "/":
                return val2 / val1;
            default:
                assert false;
                return 0.0;
        }
    }
}
