//package com.crs.main.Services;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import com.crs.main.model.Complaints;
//import com.crs.main.repository.ComplaintRepository;
//
//@DataJpaTest
//public class ComplaintimplTest {
//
//	@Autowired
//	private ComplaintRepository ComplaintRepo;
//
//
//
//	@Autowired
//	private TestEntityManager entityManager;
//
//	@Test
//	public void returnUserFromName() {
//		Complaints testComplaint = new Complaints();
//		testComplaint.setTicketId(101);
//		testComplaint.setStatus("Raised");
//		testComplaint.setPincode("474011");
//		testComplaint.setCustomerEmail("max12@example.com");
//		testComplaint.setComplaint("Broadband Services Not Working Properly");
//		entityManager.merge(testComplaint);
//		entityManager.flush();
//
//		List<Complaints> found = ComplaintRepo.findComplaintByPincode(testComplaint.getPincode());
//
//		assertEquals(((Complaints) found).getPincode(), testComplaint.getPincode());
//	}
//
//}
