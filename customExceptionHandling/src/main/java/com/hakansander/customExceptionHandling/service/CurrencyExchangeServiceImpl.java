package com.hakansander.customExceptionHandling.service;

import com.hakansander.customExceptionHandling.model.CurrencyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    final static String SCHEME = "https";
    final static String HOST = "currencyapi.net";
    final static String PATH = "/api/v1/rates";
    final static String QUERYKEY = "key={key}";
    final static String QUERYBASECURRENCY = "base={base}";
    final static String QUERYLIMIT = "limit={limit}";
    final static String LIMIT = "EUR,TRY";


    public CurrencyResponse getCurrencyExchangeValues(String baseCurrency, String key) {
        RestTemplate restTemplate = new RestTemplate();

        UriComponents uriComponents = UriComponentsBuilder.newInstance().
                        scheme(SCHEME).host(HOST).
                        path(PATH).
                        query(QUERYKEY).
                        query(QUERYBASECURRENCY).
                        query(QUERYLIMIT).
                 buildAndExpand(key, baseCurrency, LIMIT);

        CurrencyResponse result = restTemplate.getForObject(uriComponents.toString(), CurrencyResponse.class);

        return result;
    }
}
