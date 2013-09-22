
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Shen
 */
public class TokenHelper
{

    private static final Set<String> operators;

    static
    {
        operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("/");
        operators.add("*");
    }

    public static boolean isValue(String token)
    {
        Pattern digit = Pattern.compile("-?\\d+\\.?\\d*");
        Matcher matcher = digit.matcher(token);
        return matcher.matches();
    }

    public static boolean isOperator(String token)
    {
        return operators.contains(token);
    }
}
