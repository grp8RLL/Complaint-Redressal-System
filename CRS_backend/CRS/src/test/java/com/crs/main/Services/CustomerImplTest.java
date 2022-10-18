package com.crs.main.Services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crs.main.model.Customers;
import com.crs.main.repository.CustomerRepository;

import antlr.collections.List;

@SpringBootTest
class CustomerImplTest {

	@Autowired
	CustomerRepository cusrepo;
		
	
	@Test
	public void test () {
		Customers p = new Customers();
		p.setCustomerEmail("joe@gmail.com");
		p.setCustomerPassword("joe");
		p.setCustomerMobile("9879809889");
		p.setCustomerAddress("xyz");
		p.setCustomerPincode("612778");
		cusrepo.save(p);
		assertNotNull(cusrepo.findById("joe@gmail.com"));
		}
	
		
	}
		
	


