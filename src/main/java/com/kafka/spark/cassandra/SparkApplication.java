package com.kafka.spark.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.google.gson.Gson;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.kafka.spark.*"})
public class SparkApplication extends SpringBootServletInitializer {
    
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SparkApplication.class);
    }
   
    public static void main(String[] args) {
        SpringApplication.run(SparkApplication.class, args);
    }
	
	
	@Bean
	public Gson gson() {
		return new Gson();
	}
	 
}
