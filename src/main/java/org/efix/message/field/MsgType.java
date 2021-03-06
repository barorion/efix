package org.efix.message.field;

import org.efix.util.ByteSequence;
import org.efix.util.ByteSequenceWrapper;


public class MsgType {

    public static final ByteSequence HEARTBEAT = ByteSequenceWrapper.of("0");
    public static final ByteSequence TEST_REQUEST = ByteSequenceWrapper.of("1");
    public static final ByteSequence RESEND_REQUEST = ByteSequenceWrapper.of("2");
    public static final ByteSequence REJECT = ByteSequenceWrapper.of("3");
    public static final ByteSequence SEQUENCE_RESET = ByteSequenceWrapper.of("4");
    public static final ByteSequence LOGOUT = ByteSequenceWrapper.of("5");
    public static final ByteSequence INDICATION_OF_INTEREST = ByteSequenceWrapper.of("6");
    public static final ByteSequence ADVERTISEMENT = ByteSequenceWrapper.of("7");
    public static final ByteSequence EXECUTION_REPORT = ByteSequenceWrapper.of("8");
    public static final ByteSequence ORDER_CANCEL_REJECT = ByteSequenceWrapper.of("9");
    public static final ByteSequence LOGON = ByteSequenceWrapper.of("A");
    public static final ByteSequence NEWS = ByteSequenceWrapper.of("B");
    public static final ByteSequence EMAIL = ByteSequenceWrapper.of("C");
    public static final ByteSequence ORDER_SINGLE = ByteSequenceWrapper.of("D");
    public static final ByteSequence ORDER_LIST = ByteSequenceWrapper.of("E");
    public static final ByteSequence ORDER_CANCEL_REQUEST = ByteSequenceWrapper.of("F");
    public static final ByteSequence ORDER_CANCEL_REPLACE_REQUEST = ByteSequenceWrapper.of("G");
    public static final ByteSequence ORDER_STATUS_REQUEST = ByteSequenceWrapper.of("H");
    public static final ByteSequence ALLOCATION_INSTRUCTION = ByteSequenceWrapper.of("J");
    public static final ByteSequence LIST_CANCEL_REQUEST = ByteSequenceWrapper.of("K");
    public static final ByteSequence LIST_EXECUTE = ByteSequenceWrapper.of("L");
    public static final ByteSequence LIST_STATUS_REQUEST = ByteSequenceWrapper.of("M");
    public static final ByteSequence LIST_STATUS = ByteSequenceWrapper.of("N");
    public static final ByteSequence ALLOCATION_INSTRUCTION_ACK = ByteSequenceWrapper.of("P");
    public static final ByteSequence DONT_KNOW_TRADE = ByteSequenceWrapper.of("Q");
    public static final ByteSequence QUOTE_REQUEST = ByteSequenceWrapper.of("R");
    public static final ByteSequence QUOTE = ByteSequenceWrapper.of("S");
    public static final ByteSequence SETTLEMENT_INSTRUCTIONS = ByteSequenceWrapper.of("T");
    public static final ByteSequence MARKET_DATA_REQUEST = ByteSequenceWrapper.of("V");
    public static final ByteSequence MARKET_DATA_SNAPSHOT_FULL_REFRESH = ByteSequenceWrapper.of("W");
    public static final ByteSequence MARKET_DATA_INCREMENTAL_REFRESH = ByteSequenceWrapper.of("X");
    public static final ByteSequence MARKET_DATA_REQUEST_REJECT = ByteSequenceWrapper.of("Y");
    public static final ByteSequence QUOTE_CANCEL = ByteSequenceWrapper.of("Z");
    public static final ByteSequence QUOTE_STATUS_REQUEST = ByteSequenceWrapper.of("a");
    public static final ByteSequence MASS_QUOTE_ACKNOWLEDGEMENT = ByteSequenceWrapper.of("b");
    public static final ByteSequence SECURITY_DEFINITION_REQUEST = ByteSequenceWrapper.of("c");
    public static final ByteSequence SECURITY_DEFINITION = ByteSequenceWrapper.of("d");
    public static final ByteSequence SECURITY_STATUS_REQUEST = ByteSequenceWrapper.of("e");
    public static final ByteSequence SECURITY_STATUS = ByteSequenceWrapper.of("f");
    public static final ByteSequence TRADING_SESSION_STATUS_REQUEST = ByteSequenceWrapper.of("g");
    public static final ByteSequence TRADING_SESSION_STATUS = ByteSequenceWrapper.of("h");
    public static final ByteSequence MASS_QUOTE = ByteSequenceWrapper.of("i");
    public static final ByteSequence BUSINESS_MESSAGE_REJECT = ByteSequenceWrapper.of("j");
    public static final ByteSequence BID_REQUEST = ByteSequenceWrapper.of("k");
    public static final ByteSequence BID_RESPONSE = ByteSequenceWrapper.of("l");
    public static final ByteSequence LIST_STRIKE_PRICE = ByteSequenceWrapper.of("m");
    public static final ByteSequence XML_MESSAGE = ByteSequenceWrapper.of("n");
    public static final ByteSequence REGISTRATION_INSTRUCTIONS = ByteSequenceWrapper.of("o");
    public static final ByteSequence REGISTRATION_INSTRUCTIONS_RESPONSE = ByteSequenceWrapper.of("p");
    public static final ByteSequence ORDER_MASS_CANCEL_REQUEST = ByteSequenceWrapper.of("q");
    public static final ByteSequence ORDER_MASS_CANCEL_REPORT = ByteSequenceWrapper.of("r");
    public static final ByteSequence NEW_ORDER_CROSS = ByteSequenceWrapper.of("s");
    public static final ByteSequence CROSS_ORDER_CANCEL_REPLACE_REQUEST = ByteSequenceWrapper.of("t");
    public static final ByteSequence CROSS_ORDER_CANCEL_REQUEST = ByteSequenceWrapper.of("u");
    public static final ByteSequence SECURITY_TYPE_REQUEST = ByteSequenceWrapper.of("v");
    public static final ByteSequence SECURITY_TYPES = ByteSequenceWrapper.of("w");
    public static final ByteSequence SECURITY_LIST_REQUEST = ByteSequenceWrapper.of("x");
    public static final ByteSequence SECURITY_LIST = ByteSequenceWrapper.of("y");
    public static final ByteSequence DERIVATIVE_SECURITY_LIST_REQUEST = ByteSequenceWrapper.of("z");
    public static final ByteSequence DERIVATIVE_SECURITY_LIST = ByteSequenceWrapper.of("AA");
    public static final ByteSequence NEW_ORDER_MULTILEG = ByteSequenceWrapper.of("AB");
    public static final ByteSequence MULTILEG_ORDER_CANCEL_REPLACE = ByteSequenceWrapper.of("AC");
    public static final ByteSequence TRADE_CAPTURE_REPORT_REQUEST = ByteSequenceWrapper.of("AD");
    public static final ByteSequence TRADE_CAPTURE_REPORT = ByteSequenceWrapper.of("AE");
    public static final ByteSequence ORDER_MASS_STATUS_REQUEST = ByteSequenceWrapper.of("AF");
    public static final ByteSequence QUOTE_REQUEST_REJECT = ByteSequenceWrapper.of("AG");
    public static final ByteSequence RFQ_REQUEST = ByteSequenceWrapper.of("AH");
    public static final ByteSequence QUOTE_STATUS_REPORT = ByteSequenceWrapper.of("AI");
    public static final ByteSequence QUOTE_RESPONSE = ByteSequenceWrapper.of("AJ");
    public static final ByteSequence CONFIRMATION = ByteSequenceWrapper.of("AK");
    public static final ByteSequence POSITION_MAINTENANCE_REQUEST = ByteSequenceWrapper.of("AL");
    public static final ByteSequence POSITION_MAINTENANCE_REPORT = ByteSequenceWrapper.of("AM");
    public static final ByteSequence REQUEST_FOR_POSITIONS = ByteSequenceWrapper.of("AN");
    public static final ByteSequence REQUEST_FOR_POSITIONS_ACK = ByteSequenceWrapper.of("AO");
    public static final ByteSequence POSITION_REPORT = ByteSequenceWrapper.of("AP");
    public static final ByteSequence TRADE_CAPTURE_REPORT_REQUEST_ACK = ByteSequenceWrapper.of("AQ");
    public static final ByteSequence TRADE_CAPTURE_REPORT_ACK = ByteSequenceWrapper.of("AR");
    public static final ByteSequence ALLOCATION_REPORT = ByteSequenceWrapper.of("AS");
    public static final ByteSequence ALLOCATION_REPORT_ACK = ByteSequenceWrapper.of("AT");
    public static final ByteSequence CONFIRMATION_ACK = ByteSequenceWrapper.of("AU");
    public static final ByteSequence SETTLEMENT_INSTRUCTION_REQUEST = ByteSequenceWrapper.of("AV");
    public static final ByteSequence ASSIGNMENT_REPORT = ByteSequenceWrapper.of("AW");
    public static final ByteSequence COLLATERAL_REQUEST = ByteSequenceWrapper.of("AX");
    public static final ByteSequence COLLATERAL_ASSIGNMENT = ByteSequenceWrapper.of("AY");
    public static final ByteSequence COLLATERAL_RESPONSE = ByteSequenceWrapper.of("AZ");
    public static final ByteSequence COLLATERAL_REPORT = ByteSequenceWrapper.of("BA");
    public static final ByteSequence COLLATERAL_INQUIRY = ByteSequenceWrapper.of("BB");
    public static final ByteSequence NETWORK_STATUS_REQUEST = ByteSequenceWrapper.of("BC");
    public static final ByteSequence NETWORK_STATUS_RESPONSE = ByteSequenceWrapper.of("BD");
    public static final ByteSequence USER_REQUEST = ByteSequenceWrapper.of("BE");
    public static final ByteSequence USER_RESPONSE = ByteSequenceWrapper.of("BF");
    public static final ByteSequence COLLATERAL_INQUIRY_ACK = ByteSequenceWrapper.of("BG");
    public static final ByteSequence CONFIRMATION_REQUEST = ByteSequenceWrapper.of("BH");
    public static final ByteSequence TRADING_SESSION_LIST_REQUEST = ByteSequenceWrapper.of("BI");
    public static final ByteSequence TRADING_SESSION_LIST = ByteSequenceWrapper.of("BJ");
    public static final ByteSequence SECURITY_LIST_UPDATE_REPORT = ByteSequenceWrapper.of("BK");
    public static final ByteSequence ADJUSTED_POSITION_REPORT = ByteSequenceWrapper.of("BL");
    public static final ByteSequence ALLOCATION_INSTRUCTION_ALERT = ByteSequenceWrapper.of("BM");
    public static final ByteSequence EXECUTION_ACKNOWLEDGEMENT = ByteSequenceWrapper.of("BN");
    public static final ByteSequence CONTRARY_INTENTION_REPORT = ByteSequenceWrapper.of("BO");
    public static final ByteSequence SECURITY_DEFINITION_UPDATE_REPORT = ByteSequenceWrapper.of("BP");

}