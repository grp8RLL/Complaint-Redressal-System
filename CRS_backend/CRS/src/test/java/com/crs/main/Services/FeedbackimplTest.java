package com.crs.main.Services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.crs.main.model.Feedbacks;
import com.crs.main.repository.FeedbackRepository;

@SpringBootTest
public class FeedbackimplTest {
	
	@Autowired
	private FeedbackRepository FeedbackRepo;
	
	@Test
	public void returnUserFromName() {
		Feedbacks testFeedback = new Feedbacks();
		testFeedback.setTicketId(101);
		testFeedback.setFeedback("Great Customer Services!");
		
		testFeedback.setCustomerEmail("max12@example.com");
		
		
		FeedbackRepo.save(testFeedback);
		assertNotNull(FeedbackRepo.findById(1));
	}
	
	

}
