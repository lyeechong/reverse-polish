
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Shen
 */
public class TokenHelper
{

    public static boolean isValue(String token)
    {
        Pattern digit = Pattern.compile("-?\\d+\\.?\\d*");
        Matcher matcher = digit.matcher(token);        
        return matcher.matches();
    }
}
