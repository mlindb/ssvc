package com.mlindb.ssvc.core.options;

import java.io.File;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class Update implements OptionParser {

    public void parse(String... args) throws OptionParserException {
        File f = new File(args[1]);
        ParseHelper.checkFileOrDirectory(f);

        if (args.length > 2) {
            throw new OptionParserException("Error: Correct syntax is \"ssvc update [path]\"");
        }
    }
}
