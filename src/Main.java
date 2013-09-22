
/**
 *
 * @author Shen
 */
public class Main
{

    ReversePolish rp = new ReversePolish();
    public static void main(String[] args)
    {
        Main main = new Main();
        main.run();
    }
    
    public void run()
    {
        String test = "5 1 2 + 4 * + 3 -";
        double res = rp.eval(test);
        System.out.println("Result: " + res);
    }
    
}
