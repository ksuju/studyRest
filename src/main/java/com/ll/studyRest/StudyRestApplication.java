package com.ll.studyRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StudyRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyRestApplication.class, args);
	}

}
