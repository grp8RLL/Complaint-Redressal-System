package com.crs.main.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.crs.main.model.Customers;

public class CustomerTest {

	@Test
	public void CustomerEmail() {
		Customers test = new Customers();

		test.setCustomerEmail("joe@gmail.com");
		assertEquals(test.getCustomerEmail(), "joe@gmail.com");
	}

	@Test
	public void CustomerPassword() {
		Customers test = new Customers();

		test.setCustomerPassword("joe");
		assertEquals(test.getCustomerPassword(), "joe");
	}
	
	@Test
	public void CustomerMobile() {
		Customers test = new Customers();

		test.setCustomerMobile("9879809889");
		assertEquals(test.getCustomerMobile(), "9879809889");
	}
	
	@Test
	public void CustomerAddress() {
		Customers test = new Customers();

		test.setCustomerAddress("xyz");
		assertEquals(test.getCustomerAddress(), "xyz");
	}
	

	@Test
	public void CustomerPincode() {
		Customers test = new Customers();

		test.setCustomerPincode("612778");
		assertEquals(test.getCustomerPincode(), "612778");
	}
	
	@Test
	public void checkToString() {
		Customers test = new Customers();

		assertNotNull(test.toString());
	}

}