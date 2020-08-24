package com.hakansander.customExceptionHandling.service;

import com.hakansander.customExceptionHandling.model.CurrencyResponse;

public interface CurrencyExchangeService {
    CurrencyResponse getCurrencyExchangeValues(String baseCurrency, String key);
}
