package com.mlindb.ssvc.core.options;

import org.junit.Test;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class UpdateTest {

    @Test
    public void testParse() throws Exception {
        Update u = new Update();
        u.parse("", "throwexception");
    }
}