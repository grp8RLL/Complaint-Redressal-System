package com.crs.main.Services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crs.main.model.EngineerDuty;
import com.crs.main.repository.EngineerDutyRepository;

@SpringBootTest
public class EngineerDutyImplTest {

	@Autowired
	private EngineerDutyRepository EngineerRepo;

	@Test
	public void returnUserFromName() {
		EngineerDuty testDuty = new EngineerDuty();
		testDuty.setEngineerDutyId(101);
		testDuty.setEngineerEmail("john12@example.com");
		testDuty.setTicketId(111000);
		testDuty.setCustomerEmail("sam01@example.com");

		EngineerRepo.save(testDuty);
		assertNotNull(EngineerRepo.findById(1));
	}

}