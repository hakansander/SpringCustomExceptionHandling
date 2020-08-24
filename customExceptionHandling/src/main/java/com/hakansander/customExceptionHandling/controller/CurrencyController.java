package com.hakansander.customExceptionHandling.controller;

import com.hakansander.customExceptionHandling.exceptionHandling.CurrencyFormatException;
import com.hakansander.customExceptionHandling.model.CurrencyResponse;
import com.hakansander.customExceptionHandling.service.CurrencyExchangeService;
import com.hakansander.customExceptionHandling.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    @Autowired
    CurrencyExchangeService currencyExchangeService;

    @GetMapping("/{baseCurrency}")
    public CurrencyResponse getCurrencyValue(@PathVariable String baseCurrency,
                                             @RequestParam(value = "key") String key) {
        if(!CommonUtils.isValidCurrencyFormat(baseCurrency))
            throw new CurrencyFormatException("Currency format is invalid for the currency input " + baseCurrency);

        CurrencyResponse currencyResponse = currencyExchangeService.getCurrencyExchangeValues(baseCurrency, key);

        return currencyResponse;
    }
}
