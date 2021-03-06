package org.efix.message.field;


public class QuoteRejectReason {

    public static final int UNKNOWN_SYMBOL = 1;
    public static final int EXCHANGE_CLOSED = 2;
    public static final int QUOTE_REQUEST_EXCEEDS_LIMIT = 3;
    public static final int TOO_LATE_TO_ENTER = 4;
    public static final int UNKNOWN_QUOTE = 5;
    public static final int DUPLICATE_QUOTE = 6;
    public static final int INVALID_BID_ASK_SPREAD = 7;
    public static final int INVALID_PRICE = 8;
    public static final int NOT_AUTHORIZED_TO_QUOTE_SECURITY = 9;
    public static final int OTHER = 99;

}