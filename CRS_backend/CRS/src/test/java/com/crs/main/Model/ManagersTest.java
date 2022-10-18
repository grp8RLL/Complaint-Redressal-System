package com.crs.main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.crs.main.model.Managers;

public class ManagersTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	}


	@Test
	public void getAndSetManagerEmail() {
		Managers testManagers = new Managers();
		
		testManagers.setManagerEmail("ashok@gmail.com");
		assertEquals(testManagers.getManagerEmail(),"ashok@gmail.com");
	}
	
	@Test
	public void getAndSetManagerPassword() {
		Managers testManagers = new Managers();
		
		testManagers.setManagerPassword("reddy@123");
		assertEquals(testManagers.getManagerPassword(),"reddy@123");
	}
	
	@Test
	public void getAndSetManagerName() {
		Managers testManagers = new Managers();
		
		testManagers.setManagerName("Ashok");
		assertEquals(testManagers.getManagerName(),"Ashok");
	}
	
	@Test
	public void getAndSetManagerPincode() {
		Managers testManagers = new Managers();
		
		testManagers.setManagerPincode("516126");
		assertEquals(testManagers.getManagerPincode(),"516126");
	}

}
