package com.crs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_engineerDuty")

public class EngineerDuty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int engineerDutyId;

	private String engineerEmail;
	private int ticketId;
	private String customerEmail;

	public int getEngineerDutyId() {
		return engineerDutyId;
	}

	public void setEngineerDutyId(int engineerDutyId) {
		this.engineerDutyId = engineerDutyId;
	}

	public String getEngineerEmail() {
		return engineerEmail;
	}

	public void setEngineerEmail(String engineerEmail) {
		this.engineerEmail = engineerEmail;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "EngineerDuty [engineerDutyId=" + engineerDutyId + ", engineerEmail=" + engineerEmail + ", ticketId="
				+ ticketId + ", customerEmail=" + customerEmail + "]";
	}

}
