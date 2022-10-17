package com.crs.main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;


import com.crs.main.model.EngineerDuty;

public class EngineerDutyTest {
	
	@Test
	public void getAndsetEngineerDutyId() {
		EngineerDuty testDuty = new EngineerDuty();

		testDuty.setEngineerDutyId(101);
		assertEquals(testDuty.getEngineerDutyId(), 101);
	}
	
	@Test
	public void getAndsetEngineerEmail() {
		EngineerDuty testDuty = new EngineerDuty();

		testDuty.setEngineerEmail("john12@example.com");
		assertEquals(testDuty.getEngineerEmail(), "john12@example.com");
	}
	
	@Test
	public void getAndsetTicketID() {
		EngineerDuty testDuty = new EngineerDuty();

		testDuty.setTicketId(111000);
		assertEquals(testDuty.getTicketId(), 111000);
	}
	
	@Test
	public void getAndsetCustomerEmail() {
		EngineerDuty testDuty = new EngineerDuty();

		testDuty.setCustomerEmail("sam01@example.com");
		assertEquals(testDuty.getCustomerEmail(), "sam01@example.com");
	}
	
	@Test
	public void checkToString() {
		EngineerDuty testDuty = new EngineerDuty();
		assertNotNull(testDuty.toString());
	}

}
