package com.mlindb.ssvc.core.options;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public enum Option {
    CHECKOUT (new Checkout()),
    COMMIT (new Commit()),
    CREATE (new Create()),
    UPDATE (new Update());

    private OptionParser instance;

    Option(OptionParser object) {
        this.instance = object;
    }

    public OptionParser getInstance() {
        return instance;
    }
}
