
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
        
        double result = 0.0;
        while (!inputTokens.isEmpty())
        {
            String head = inputTokens.poll();
            if(TokenHelper.isValue(head))
            {
                stack.push(head);
            }
            else //is an operator
            {
                if(stack.size() < 2)
                {
                    
                }
            }
        }
        return result;
    }
    
}
