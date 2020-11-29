package br.com.msansone.api.stockwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockWebServiceApplication.class, args);
	}

}
