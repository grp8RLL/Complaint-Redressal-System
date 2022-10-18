package com.crs.main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.crs.main.model.Engineers;

@SpringBootTest
public class EngineersTest {

	@Test
	public void getAndSetEngineerEmail() {
		Engineers testEngineers = new Engineers();

		testEngineers.setEngineerEmail("abc@gmail.com");
		assertEquals(testEngineers.getEngineerEmail(), "abc@gmail.com");
	}

	@Test
	public void getAndSetEngineerPassword() {
		Engineers testEngineers = new Engineers();

		testEngineers.setEngineerPassword("1234");
		assertEquals(testEngineers.getEngineerPassword(), "1234");
	}

	@Test
	public void getAndSetEngineerName() {
		Engineers testEngineers = new Engineers();

		testEngineers.setEngineerName("abc");
		assertEquals(testEngineers.getEngineerName(), "abc");
	}
	@Test
	public void checkToString() {
		Engineers testEngineers = new Engineers();
		assertNotNull(testEngineers.toString());
		
	}

}