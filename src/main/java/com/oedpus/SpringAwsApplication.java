package com.oedpus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // JPA Auditing È°¼ºÈ­
public class SpringAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsApplication.class, args);
	}

}
