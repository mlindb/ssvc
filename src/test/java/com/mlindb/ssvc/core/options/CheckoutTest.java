package com.mlindb.ssvc.core.options;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class CheckoutTest {

    @Test
    public void testParseTooManyArgs() throws Exception {
        String expectedErrorMsg = "Error: Correct syntax is \"ssvc checkout [repository path]\"";
        try {
            new Update().parse("", ".", "");
            Assert.fail("Should have thrown an OptionParserException because of too many args!");
        } catch (OptionParserException e) {
            Assert.assertEquals(expectedErrorMsg, e.getMessage());
        }
    }
}