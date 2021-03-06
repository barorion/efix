package org.efix.util.parse;

import org.efix.util.MutableInt;
import org.efix.util.buffer.Buffer;
import org.efix.util.buffer.BufferUtil;
import org.efix.util.type.DecimalType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.efix.util.TestUtil.generateDecimal;


public class DecimalParserTest extends AbstractParserTest {

    protected static final long MAX_VALUE = 999999999999999999L;
    protected static final long MIN_VALUE = -999999999999999999L;

    @Test
    public void shouldParseDecimals() {
        shouldParse("-1", 0);
        shouldParse("-12", 0);
        shouldParse("-123", 0);
        shouldParse("-1234", 0);
        shouldParse("-12345", 0);
        shouldParse("-123456", 0);
        shouldParse("-1234567", 0);
        shouldParse("-12345678", 0);
        shouldParse("-123456789", 0);
        shouldParse("-1234567890", 0);
        shouldParse("-12345678901", 0);
        shouldParse("-123456789012", 0);
        shouldParse("-1234567890123", 0);
        shouldParse("-12345678901234", 0);
        shouldParse("-123456789012345", 0);
        shouldParse("-999999999999999", 0);

        shouldParse("1", 0);
        shouldParse("12", 0);
        shouldParse("123", 0);
        shouldParse("1234", 0);
        shouldParse("12345", 0);
        shouldParse("123456", 0);
        shouldParse("1234567", 0);
        shouldParse("12345678", 0);
        shouldParse("123456789", 0);
        shouldParse("1234567890", 0);
        shouldParse("12345678901", 0);
        shouldParse("123456789012", 0);
        shouldParse("1234567890123", 0);
        shouldParse("12345678901234", 0);
        shouldParse("123456789012345", 0);
        shouldParse("999999999999999", 0);

        shouldParse("-1.23456789012345", 14);
        shouldParse("-12.3456789012345", 13);
        shouldParse("-123.456789012345", 12);
        shouldParse("-1234.56789012345", 11);
        shouldParse("-12345.6789012345", 10);
        shouldParse("-123456.789012345", 9);
        shouldParse("-1234567.89012345", 8);
        shouldParse("-12345678.9012345", 7);
        shouldParse("-123456789.012345", 6);
        shouldParse("-1234567890.12345", 5);
        shouldParse("-12345678901.2345", 4);
        shouldParse("-123456789012.345", 3);
        shouldParse("-1234567890123.45", 2);
        shouldParse("-12345678901234.5", 1);
        shouldParse("-123456789012345.", 0);

        shouldParse("1.23456789012345", 14);
        shouldParse("12.3456789012345", 13);
        shouldParse("123.456789012345", 12);
        shouldParse("1234.56789012345", 11);
        shouldParse("12345.6789012345", 10);
        shouldParse("123456.789012345", 9);
        shouldParse("1234567.89012345", 8);
        shouldParse("12345678.9012345", 7);
        shouldParse("123456789.012345", 6);
        shouldParse("1234567890.12345", 5);
        shouldParse("12345678901.2345", 4);
        shouldParse("123456789012.345", 3);
        shouldParse("1234567890123.45", 2);
        shouldParse("12345678901234.5", 1);
        shouldParse("123456789012345.", 0);

        shouldParse("-0.23456789012345", 16);
        shouldParse("-00.3456789012345", 15);
        shouldParse("-000.456789012345", 14);
        shouldParse("-0000.56789012345", 13);
        shouldParse("-00000.6789012345", 12);
        shouldParse("-000000.789012345", 11);
        shouldParse("-0000000.89012345", 10);
        shouldParse("-00000000.9012345", 9);
        shouldParse("-000000000.012345", 8);
        shouldParse("-0000000000.12345", 7);
        shouldParse("-00000000000.2345", 6);
        shouldParse("-000000000000.345", 5);
        shouldParse("-0000000000000.45", 4);
        shouldParse("-00000000000000.5", 3);
        shouldParse("-00000000000000.0", 2);

        shouldParse("0.23456789012345", 16);
        shouldParse("00.3456789012345", 15);
        shouldParse("000.456789012345", 14);
        shouldParse("0000.56789012345", 13);
        shouldParse("00000.6789012345", 12);
        shouldParse("000000.789012345", 11);
        shouldParse("0000000.89012345", 10);
        shouldParse("00000000.9012345", 9);
        shouldParse("000000000.012345", 8);
        shouldParse("0000000000.12345", 7);
        shouldParse("00000000000.2345", 6);
        shouldParse("000000000000.345", 5);
        shouldParse("0000000000000.45", 4);
        shouldParse("00000000000000.5", 3);
        shouldParse("00000000000000.0", 2);

        shouldParse("-0.00000000000005", 16);
        shouldParse("-00.0000000000005", 15);
        shouldParse("-000.000000000005", 14);
        shouldParse("-0000.00000000005", 13);
        shouldParse("-00000.0000000005", 12);
        shouldParse("-000000.000000005", 11);
        shouldParse("-0000000.00000005", 10);
        shouldParse("-00000000.0000005", 9);
        shouldParse("-000000000.000005", 8);
        shouldParse("-0000000000.00005", 7);
        shouldParse("-00000000000.0005", 6);
        shouldParse("-000000000000.005", 5);
        shouldParse("-0000000000000.05", 4);
        shouldParse("-00000000000000.5", 3);
        shouldParse("-00000000000000.0", 2);

        shouldParse("0.00000000000005", 16);
        shouldParse("00.0000000000005", 15);
        shouldParse("000.000000000005", 14);
        shouldParse("0000.00000000005", 13);
        shouldParse("00000.0000000005", 12);
        shouldParse("000000.000000005", 11);
        shouldParse("0000000.00000005", 10);
        shouldParse("00000000.0000005", 9);
        shouldParse("000000000.000005", 8);
        shouldParse("0000000000.00005", 7);
        shouldParse("00000000000.0005", 6);
        shouldParse("000000000000.005", 5);
        shouldParse("0000000000000.05", 4);
        shouldParse("00000000000000.5", 3);
        shouldParse("00000000000000.0", 2);

        shouldParse("000000000000000.", 3);
        shouldParse("-000000000000000.", 3);

        shouldParse("0.011", 4, true);
        shouldParse("-0.011", 4, false);

        shouldParse("9.999", 2, true);
        shouldParse("10.99", 1, false);
        shouldParse("99.99", 1, true);
        shouldParse("10.095", 2, false);
        shouldParse("10.05000", 1, false);
        shouldParse("10.05000", 1, true);
        shouldParse("-10.05000", 1, false);
        shouldParse("-10.05000", 1, true);
        shouldParse("10.05001", 1, false);
        shouldParse("10.05001", 1, true);
    }

    @Test
    public void shouldParseRandomDecimals() {
        for (int i = 0; i < 1000000; i++) {
            for (int integerDigits = 1; integerDigits <= DecimalType.MAX_DIGITS; integerDigits++) {
                int fractionalDigits = DecimalType.MAX_DIGITS - integerDigits;
                String decimal = generateDecimal(integerDigits, fractionalDigits);

                int scale = fractionalDigits;
                shouldParse(decimal, scale);

                for (scale = 0; scale <= fractionalDigits; scale++) {
                    shouldParse(decimal, scale, true);
                    shouldParse(decimal, scale, false);
                }
            }
        }
    }

    @Test
    public void shouldFailParseDecimals() {
        shouldFailParse(Long.MAX_VALUE, 0);
        shouldFailParse(Long.MIN_VALUE, 0);
        shouldFailParse(MIN_VALUE - 1, 0);
        shouldFailParse(MAX_VALUE + 1, 0);

        shouldFailParse("hd", 0);
        shouldFailParse("3ttt", 0);
        shouldFailParse("111");
        shouldFailParse("111111111111111111111111111111=", 0);
        shouldFailParse("1", 0);
        shouldFailParse("12345", 0);
        shouldFailParse("-", 0);
        shouldFailParse("-=", 0);
        shouldFailParse("-123", 0);
        shouldFailParse("=", 0);
        shouldFailParse("", 0);
        shouldFailParse(".0=", 0);
        shouldFailParse("0.11=", 1);
        shouldFailParse("-0.11=", 1);
        shouldFailParse("-0.s11=", 2);
        shouldFailParse("12345678901234.11=", 2);
        shouldFailParse("1234567890123411=", 0);
        shouldFailParse("123456789012341.1=", 1);
        shouldFailParse("s", 1);

        shouldFailParse("hd", 0, true);
        shouldFailParse("3ttt", 0, true);
        shouldFailParse("111", 0, true);
        shouldFailParse("111111111111111111111111111111=", 0, true);
        shouldFailParse("1", 0, true);
        shouldFailParse("12345", 0, true);
        shouldFailParse("-", 0, true);
        shouldFailParse("-=", 0, true);
        shouldFailParse("-123", 0, true);
        shouldFailParse("=", 0, true);
        shouldFailParse("", 0, true);
        shouldFailParse(".0=", 0, true);
        shouldFailParse("-0.s11=", 2, true);
        shouldFailParse("12345678901234.11=", 2, true);
        shouldFailParse("1234567890123411=", 0, true);
        shouldFailParse("123456789012341.1=", 1, true);
        shouldFailParse("s", 1, true);
        shouldFailParse("1234567890123.1=", 6, true);
        shouldFailParse("1.123456789012345=", 0, true);
    }

    protected static void shouldParse(String value, int scale) {
        Buffer buffer = BufferUtil.fromString(value + (char) SEPARATOR);
        MutableInt offset = new MutableInt(0);
        int end = buffer.capacity();

        long expected = new BigDecimal(value).movePointRight(scale).longValueExact();
        long actual = DecimalParser.parseDecimal(scale, SEPARATOR, buffer, offset, end);

        Assert.assertEquals("Can't parse " + value, end, offset.get());
        Assert.assertEquals("Can't parse " + value, expected, actual);
    }

    protected static void shouldFailParse(long value, int scale) {
        shouldFailParse(Long.toString(value) + (char) SEPARATOR, scale);
    }

    protected static void shouldFailParse(String string, int scale) {
        Buffer buffer = BufferUtil.fromString(string);
        MutableInt offset = new MutableInt(0);
        int end = buffer.capacity();

        try {
            DecimalParser.parseDecimal(scale, SEPARATOR, buffer, offset, end);
            Assert.fail("Should fail parse " + string);
        } catch (ParserException e) {
            Assert.assertTrue("Caught", true);
        }
    }

    protected static void shouldParse(String value, int scale, boolean roundUp) {
        Buffer buffer = BufferUtil.fromString(value + (char) SEPARATOR);
        MutableInt offset = new MutableInt(0);
        int end = buffer.capacity();

        long expected = new BigDecimal(value)
                .setScale(scale, roundUp ? RoundingMode.HALF_UP : RoundingMode.HALF_DOWN)
                .movePointRight(scale)
                .longValueExact();

        long actual = DecimalParser.parseDecimal(scale, roundUp, SEPARATOR, buffer, offset, end);

        Assert.assertEquals("Can't parse " + value, end, offset.get());
        Assert.assertEquals("Can't parse " + value, expected, actual);
    }

    protected static void shouldFailParse(String string, int scale, boolean roundUp) {
        Buffer buffer = BufferUtil.fromString(string);
        MutableInt offset = new MutableInt(0);
        int end = buffer.capacity();

        try {
            DecimalParser.parseDecimal(scale, roundUp, SEPARATOR, buffer, offset, end);
            Assert.fail("Should fail parse " + string);
        } catch (ParserException e) {
            Assert.assertTrue("Caught", true);
        }
    }

}
