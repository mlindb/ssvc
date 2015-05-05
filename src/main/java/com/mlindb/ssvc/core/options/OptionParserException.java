package com.mlindb.ssvc.core.options;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public class OptionParserException extends Exception {
    public OptionParserException() {
        super();
    }

    public OptionParserException(String message) {
        super(message);
    }

    public OptionParserException(String message, Throwable e) {
        super(message, e);
    }

    public OptionParserException(Throwable e) {
        super(e);
    }
}
