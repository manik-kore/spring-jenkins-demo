package com.app.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Test Case Executing.....");
		assertEquals(true, true);
		
	}

}
