package com.mlindb.ssvc.core.options;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class OptionTest {

    @Test
    public void testGetInstance() throws Exception {
        OptionParser checkout = Option.valueOf("checkout".toUpperCase()).getInstance();
        OptionParser create = Option.valueOf("create".toUpperCase()).getInstance();
        OptionParser commit = Option.valueOf("commit".toUpperCase()).getInstance();
        OptionParser update = Option.valueOf("update".toUpperCase()).getInstance();

        assertEquals(Checkout.class, checkout.getClass());
        assertEquals(Create.class, create.getClass());
        assertEquals(Commit.class, commit.getClass());
        assertEquals(Update.class, update.getClass());
    }
}