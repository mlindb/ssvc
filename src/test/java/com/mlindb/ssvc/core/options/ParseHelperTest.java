package com.mlindb.ssvc.core.options;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class ParseHelperTest {

    @Test
    public void testCheckFileOrDirectory() throws Exception {
        String expectedErrorMsg = "Error: e is neither a file nor a directory.";
        try {
            new Update().parse("", "e");
            Assert.fail("Should have thrown an OptionParserException because age is invalid!");
        } catch (OptionParserException e) {
            Assert.assertEquals(expectedErrorMsg, e.getMessage());
        }
    }
}