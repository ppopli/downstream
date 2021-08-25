package com.example.downstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = {"com.example.downstream", "com.pulkit.requesttracer"})
public class DownstreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DownstreamApplication.class, args);
	}

}
