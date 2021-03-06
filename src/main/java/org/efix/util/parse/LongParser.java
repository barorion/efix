package org.efix.util.parse;

import org.efix.util.MutableInt;
import org.efix.util.buffer.Buffer;
import org.efix.util.type.LongType;

import static org.efix.util.parse.ParserUtil.*;


public class LongParser {

    protected static final int MAX_DIGITS = LongType.MAX_ULONG_LENGTH - 1;

    public static long parseLong(byte separator, Buffer buffer, MutableInt offset, int end) {
        int off = offset.get();
        checkBounds(SIGN_LENGTH, end - off);

        if (buffer.getByte(off) == '-') {
            offset.set(off + SIGN_LENGTH);
            return -parseULong(separator, buffer, offset, end);
        } else {
            return parseULong(separator, buffer, offset, end);
        }
    }

    public static long parseULong(byte separator, Buffer buffer, MutableInt offset, int end) {
        int start = offset.get();
        int off = start;

        checkBounds(LongType.MIN_LENGTH + SEPARATOR_LENGTH, end - off);

        byte b = buffer.getByte(off++);
        long value = digit(b);
        if (!isDigit(b))
            throwUnexpectedByte(b);

        do {
            b = buffer.getByte(off++);
            if (isDigit(b)) {
                value = (value << 3) + (value << 1) + digit(b);
            } else if (b == separator) {
                int digits = off - start - SEPARATOR_LENGTH;
                checkLong(digits);
                offset.set(off);
                return value;
            } else {
                throwUnexpectedByte(b);
            }
        } while (off < end);

        throw throwSeparatorNotFound(separator);
    }

    protected static void checkLong(int digits) {
        if (digits > MAX_DIGITS)
            throw new ParserException(String.format("Integer contains too many digits %s, max %s", digits, MAX_DIGITS));
    }

}
