package com.example.soapconsumingservice;

import com.example.soapconsumingservice.config.CountryClient;
import com.example.soapconsumingservice.wsdl.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SoapconsumingserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SoapconsumingserviceApplication.class, args);
	}
	@Bean
	CommandLineRunner lookup(CountryClient quoteClient) {
		return args -> {
			String country = "Spain";

			if (args.length > 0) {
				country = args[0];
			}
			GetCountryResponse response = quoteClient.getCountry(country);
			System.out.println(response.getCountry().getCurrency());
		};
	}


}
