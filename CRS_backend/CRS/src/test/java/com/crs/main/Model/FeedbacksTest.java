package com.crs.main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;


import com.crs.main.model.Feedbacks;

public class FeedbacksTest {
	
	@Test
	public void getAndSetTicketID() {
		Feedbacks testFeedbacks = new Feedbacks();

		testFeedbacks.setTicketId(11111);
		assertEquals(testFeedbacks.getTicketId(), 11111);
	}
	
	@Test
	public void getAndSetfeedbackId() {
		Feedbacks testFeedbacks = new Feedbacks();

		testFeedbacks.setFeedbackId(101);
		assertEquals(testFeedbacks.getFeedbackId(), 101);
	}
	
	@Test
	public void getAndSetcustomerEmail() {
		Feedbacks testFeedbacks = new Feedbacks();

		testFeedbacks.setCustomerEmail("max12@example.com");
		assertEquals(testFeedbacks.getCustomerEmail(), "max12@example.com");
	}
	
	@Test
	public void getAndSetFeedback() {
		Feedbacks testFeedbacks = new Feedbacks();

		testFeedbacks.setFeedback("Good Services!");
		assertEquals(testFeedbacks.getFeedback(), "Good Services!");
	}
	
	@Test
	public void checkToString() {
		Feedbacks testFeedbacks = new Feedbacks();

		assertNotNull(testFeedbacks.toString());
	}

}
