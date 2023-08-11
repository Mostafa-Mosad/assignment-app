package com.codercampus.assignmentsubmissionapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class AssignmentSubmissionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void password() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("Mosad123"));
	}

}
