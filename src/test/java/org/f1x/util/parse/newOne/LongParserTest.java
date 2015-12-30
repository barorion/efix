package org.f1x.util.parse.newOne;

import org.junit.Test;

import java.util.Random;

import static org.f1x.util.TestUtil.arrayOf;

public class LongParserTest extends AbstractParserTest {

    protected static final ParserVerifier<Long> VERIFIER = Long::parseLong;
    protected static final Parser<Long> INTEGER_PARSER = LongParser::parseLong;
    protected static final Parser<Long> POSITIVE_PARSER = LongParser::parsePositiveLong;
    protected static final Parser<Long>[] ALL_PARSERS = arrayOf(INTEGER_PARSER, POSITIVE_PARSER);

    @Test
    public void shouldParseNumbers() {
        shouldParse(-1, INTEGER_PARSER);
        shouldParse(-12, INTEGER_PARSER);
        shouldParse(-123, INTEGER_PARSER);
        shouldParse(-1234, INTEGER_PARSER);
        shouldParse(-12345, INTEGER_PARSER);
        shouldParse(-123456, INTEGER_PARSER);
        shouldParse(-1234567, INTEGER_PARSER);
        shouldParse(-12345678, INTEGER_PARSER);
        shouldParse(-123456789, INTEGER_PARSER);
        shouldParse(-1234567890, INTEGER_PARSER);
        shouldParse(-12345678901L, INTEGER_PARSER);
        shouldParse(-123456789012L, INTEGER_PARSER);
        shouldParse(-1234567890123L, INTEGER_PARSER);
        shouldParse(-12345678901234L, INTEGER_PARSER);
        shouldParse(-123456789012345L, INTEGER_PARSER);
        shouldParse(-1234567890123456L, INTEGER_PARSER);
        shouldParse(-12345678901234567L, INTEGER_PARSER);
        shouldParse(-123456789012345678L, INTEGER_PARSER);
        shouldParse(-999999999999999999L, INTEGER_PARSER);

        shouldParse("-00012", INTEGER_PARSER);
        shouldParse("-031", INTEGER_PARSER);

        shouldParse(0, ALL_PARSERS);
        shouldParse(1, ALL_PARSERS);
        shouldParse(12, ALL_PARSERS);
        shouldParse(123, ALL_PARSERS);
        shouldParse(1234, ALL_PARSERS);
        shouldParse(12345, ALL_PARSERS);
        shouldParse(123456, ALL_PARSERS);
        shouldParse(1234567, ALL_PARSERS);
        shouldParse(12345678, ALL_PARSERS);
        shouldParse(123456789, ALL_PARSERS);
        shouldParse(1234567890, ALL_PARSERS);
        shouldParse(12345678901L, ALL_PARSERS);
        shouldParse(123456789012L, ALL_PARSERS);
        shouldParse(1234567890123L, ALL_PARSERS);
        shouldParse(12345678901234L, ALL_PARSERS);
        shouldParse(123456789012345L, ALL_PARSERS);
        shouldParse(1234567890123456L, ALL_PARSERS);
        shouldParse(12345678901234567L, ALL_PARSERS);
        shouldParse(123456789012345678L, ALL_PARSERS);
        shouldParse(999999999999999999L, ALL_PARSERS);

        shouldParse("01", ALL_PARSERS);
        shouldParse("002", ALL_PARSERS);
        shouldParse("000101", ALL_PARSERS);
        shouldParse("00123456", ALL_PARSERS);
    }

    @Test
    public void shouldParseRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 50000; i++) {
            long number = random.nextLong() / 10;
            if (number >= 0)
                shouldParse(number, ALL_PARSERS);
            else
                shouldParse(number, INTEGER_PARSER);
        }
    }

    @Test
    public void shouldFailParseNumbers() {
        shouldFailParse(1000000000000000000L, ALL_PARSERS);
        shouldFailParse(Long.MAX_VALUE, ALL_PARSERS);
        shouldFailParse(-1000000000000000000L, ALL_PARSERS);
        shouldFailParse(Long.MIN_VALUE, ALL_PARSERS);

        shouldFailParse("hd", ALL_PARSERS);
        shouldFailParse("3ttt", ALL_PARSERS);
        shouldFailParse("111", ALL_PARSERS);
        shouldFailParse("111111111111111111111111111111=", ALL_PARSERS);
        shouldFailParse("1", ALL_PARSERS);
        shouldFailParse("12345", ALL_PARSERS);
        shouldFailParse("-", ALL_PARSERS);
        shouldFailParse("-=", ALL_PARSERS);
        shouldFailParse("-123", ALL_PARSERS);
        shouldFailParse("=", ALL_PARSERS);
        shouldFailParse("", ALL_PARSERS);
        shouldFailParse("0123456789011111111=", ALL_PARSERS);
        shouldFailParse("-0123456789011111111=", ALL_PARSERS);

        shouldFailParse("-1=", POSITIVE_PARSER);
        shouldFailParse("-25=", POSITIVE_PARSER);
        shouldFailParse("-105=", POSITIVE_PARSER);
        shouldFailParse("-0105=", POSITIVE_PARSER);
    }

    @SafeVarargs
    protected static void shouldParse(long number, Parser<Long>... parsers) {
        shouldParse("" + number, parsers);
    }

    @SafeVarargs
    protected static void shouldParse(String string, Parser<Long>... parsers) {
        shouldParse(string, VERIFIER, parsers);
    }

    protected static void shouldFailParse(long number, Parser<?>... parsers) {
        shouldFailParse("" + number + (char) SEPARATOR, parsers);
    }

}
