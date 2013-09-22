
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

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

        double result = 0.0;
        while (!inputTokens.isEmpty())
        {
            String head = inputTokens.poll();
            
        }
        return result;
    }
    
}
