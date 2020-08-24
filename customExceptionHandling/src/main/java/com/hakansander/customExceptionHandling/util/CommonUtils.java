package com.hakansander.customExceptionHandling.util;

public class CommonUtils {
    final static String ALPHABETICAL_REGEX_PATTERN = "^[a-zA-Z]*$";

    public static boolean isValidCurrencyFormat(String currency) {
        if(currency == null) {
            return false;
        }

        return currency.matches(ALPHABETICAL_REGEX_PATTERN);
    }
}
