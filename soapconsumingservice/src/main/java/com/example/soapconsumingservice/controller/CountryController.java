package com.example.soapconsumingservice.controller;

import com.example.soapconsumingservice.config.CountryClient;
import com.example.soapconsumingservice.models.CountryBean;
import com.example.soapconsumingservice.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryClient quoteClient;

    @GetMapping("/{name}")
    public CountryBean getCountryCurrency (@PathVariable String name){
        System.out.println("Name"+name);
        GetCountryResponse response = quoteClient.getCountry(name);
        CountryBean countryBean= new CountryBean();
        countryBean.setCountryName(response.getCountry().getName());
        countryBean.setCountryPopulation(response.getCountry().getPopulation());
        countryBean.setCaptial(response.getCountry().getCapital());
        countryBean.setCurrency(response.getCountry().getCurrency().toString());
        return countryBean;
    }
}
