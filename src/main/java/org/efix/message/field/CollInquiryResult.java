package org.efix.message.field;


public class CollInquiryResult {

    public static final int SUCCESSFUL = 0;
    public static final int INVALID_OR_UNKNOWN_INSTRUMENT = 1;
    public static final int INVALID_OR_UNKNOWN_COLLATERAL_TYPE = 2;
    public static final int INVALID_PARTIES = 3;
    public static final int INVALID_TRANSPORT_TYPE_REQUESTED = 4;
    public static final int INVALID_DESTINATION_REQUESTED = 5;
    public static final int NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED = 6;
    public static final int NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED = 7;
    public static final int COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED = 8;
    public static final int UNAUTHORIZED_FOR_COLLATERAL_INQUIRY = 9;
    public static final int OTHER = 99;

}