package com.stanbic.service.salesforce.data.sync.service;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@SpringBootApplication
@EnableSwagger2
@EnableEncryptableProperties
public class SalesforceDataSyncServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesforceDataSyncServiceApplication.class, args);
	}

}
