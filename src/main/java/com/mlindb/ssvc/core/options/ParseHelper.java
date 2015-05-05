package com.mlindb.ssvc.core.options;

import java.io.File;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
class ParseHelper {
    private ParseHelper() {}

    static void checkFileOrDirectory(File f) throws OptionParserException{
        if (!f.isFile() && !f.isDirectory()) {
            throw new OptionParserException("Error: " + f.getName() + " is neither a file nor a directory.");
        }
    }
}
