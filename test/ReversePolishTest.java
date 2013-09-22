/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shen
 */
public class ReversePolishTest
{

    @Test
    public void testEval()
    {
        ReversePolish rp = new ReversePolish();
        List<TestCase> cases = new ArrayList<>();
        cases.add(new TestCase("5 1 2 + 4 * + 3 -", 14));
        cases.add(new TestCase("1 2 + 3 *", 9));
        cases.add(new TestCase("4 2 5 * + 1 3 2 * + /", 2));
        for (TestCase tc : cases)
        {
            double actual = rp.eval(tc.getEval());
            double expected = tc.getRes();
            assertEquals(actual, expected, 0.01);
        }
    }

    class TestCase
    {

        private String eval;
        private double res;

        public TestCase(String eval, double res)
        {
            this.eval = eval;
            this.res = res;
        }

        public String getEval()
        {
            return eval;
        }

        public double getRes()
        {
            return res;
        }
    }
}