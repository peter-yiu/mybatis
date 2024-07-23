package com.fyber.backend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@SpringBootTest
@AutoConfigureMockMvc
@SpringJUnitConfig
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntegrateFyberApplicationTest {

	@Test
	void contextLoads() {
		System.out.println("contextLoads1 = " + 1);
	}

	@Test
	void contextLoads2() {
		System.out.println("contextLoads2 = " + 2);
	}

}
