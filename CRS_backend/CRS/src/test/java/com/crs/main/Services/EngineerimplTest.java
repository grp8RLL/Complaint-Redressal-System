package com.crs.main.Services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crs.main.model.Engineers;
import com.crs.main.repository.EngineerRepository;

@SpringBootTest
public class EngineerimplTest {

	@Autowired
	EngineerRepository engineerRepository;

	@Test
	public void returnEngineerById() {
		Engineers testEngineers = new Engineers();
		testEngineers.setEngineerEmail("abc@gmail.com");
		testEngineers.setEngineerPassword("1234");
		testEngineers.setEngineerName("abc");

		engineerRepository.save(testEngineers);
		assertNotNull(engineerRepository.findById("abc@gmail.com"));
	}
	
	@Test
	public void returnDeleteEngineerById() {
		Engineers testEngineers = new Engineers();
		testEngineers.setEngineerEmail("abc@gmail.com");
		testEngineers.setEngineerPassword("1234");
		testEngineers.setEngineerName("abc");
		engineerRepository.delete(testEngineers);
		assertNotNull(engineerRepository.findById("abc@gmail.com"));
	}
}
