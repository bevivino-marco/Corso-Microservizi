package com.in28minutes.microservice.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange", url="localhost:8000")
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);



    // il nome è dato dal fatto che voglio chiamare il currency exchange
    // ritorna CurrencyConversion non CurrencyExchange perchè que non ho visibilità della classe dell'altro microservizio e CConversion "contiene"
    // Cexchange
    }
