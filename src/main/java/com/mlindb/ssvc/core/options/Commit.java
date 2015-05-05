package com.mlindb.ssvc.core.options;

import java.io.File;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class Commit implements OptionParser {

    public void parse(String[] args) throws OptionParserException {
        File f = new File(args[1]);
        ParseHelper.checkFileOrDirectory(f);
    }
}
