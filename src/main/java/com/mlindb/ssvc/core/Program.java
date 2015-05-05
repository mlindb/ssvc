package com.mlindb.ssvc.core;

import com.mlindb.ssvc.core.options.Option;
import com.mlindb.ssvc.core.options.OptionParser;
import com.mlindb.ssvc.core.options.OptionParserException;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class Program {
    public static void main(String[] args) {
        run(args);
    }

    private static void run(String[] args) {
        try {
            OptionParser p = Option.valueOf(args[0]).getInstance();
            p.parse(args);
        } catch (IllegalArgumentException e) {
            die("Error");
        } catch (OptionParserException e) {
            die(e.getMessage());
        }
    }

    private static void die(String msg) {
        System.err.println(msg);
        System.exit(-1);
    }
}
