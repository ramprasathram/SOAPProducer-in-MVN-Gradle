package com.example.soapconsumingservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

public class CountryBean {

public String CountryName;
public int CountryPopulation;
public String Captial;
public String Currency;

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public int getCountryPopulation() {
        return CountryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        CountryPopulation = countryPopulation;
    }

    public String getCaptial() {
        return Captial;
    }

    public void setCaptial(String captial) {
        Captial = captial;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }
}
