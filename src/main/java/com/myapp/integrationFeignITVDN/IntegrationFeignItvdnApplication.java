package com.myapp.integrationFeignITVDN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class IntegrationFeignItvdnApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationFeignItvdnApplication.class, args);
	}

}
