package com.crs.main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.crs.main.model.Complaints;

public class ComplaintsTest {

	@Test
	public void getAndSetTicketID() {
		Complaints testComplaint = new Complaints();

		testComplaint.setTicketId(11111);
		assertEquals(testComplaint.getTicketId(), 11111);
	}

	@Test
	public void getAndSetPincode() {
		Complaints testComplaint = new Complaints();

		testComplaint.setPincode("474011");
		assertEquals(testComplaint.getPincode(), "474011");
	}

	@Test
	public void getAndSetComplaint() {
		Complaints testComplaint = new Complaints();

		testComplaint.setComplaint("Broadband Services Not Working Properly");
		assertEquals(testComplaint.getComplaint(), "Broadband Services Not Working Properly");
	}

	@Test
	public void getAndSetStatus() {
		Complaints testComplaint = new Complaints();

		testComplaint.setStatus("Raised");
		assertEquals(testComplaint.getStatus(), "Raised");
	}

	@Test
	public void getAndSetcustomerEmail() {
		Complaints testComplaint = new Complaints();

		testComplaint.setCustomerEmail("max12@example.com");
		assertEquals(testComplaint.getCustomerEmail(), "max12@example.com");
	}

	@Test
	public void checkToString() {
		Complaints testComplaint = new Complaints();

		assertNotNull(testComplaint.toString());
	}

}