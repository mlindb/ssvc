package com.mlindb.ssvc.core.options;

import java.io.File;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class Update implements OptionParser {
    public void parse(String... args) throws OptionParserException {
        String path = args[1];

        File f = new File(path);
        if (!f.isFile() && !f.isDirectory()) {
            throw new OptionParserException("Error: " + path + " is neither a file nor a directory.");
        }
    }
}
