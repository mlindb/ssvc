package options;

/**
 * Created by magnus.lindberg on 2015-05-05.
 */
public interface OptionParser {
    void parse(String[] args) throws OptionParserException;
}
