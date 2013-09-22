/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shen
 */
public class TokenHelperTest
{

    @Test
    public void testIsValue()
    {
        String[] valid =
        {
            "0",
            "0.0",
            "1",
            "2",
            "2",
            "1.2",
            "1.2555",
            "14441.2",
            "-14441.2",
            "14741.288",
            "32",
            "255",
            "-299",
            "454",
            "7."
        };
        String[] invalid =
        {
            "hello",
            "invalid",
            "0.0..",
            ".0",
            "0.555.",
            "785+",
            "--852",
        };
        for (String v : valid)
        {
            assertTrue(v, TokenHelper.isValue(v));
        }
        for (String i : invalid)
        {
            assertFalse(i, TokenHelper.isValue(i));
        }
    }
}