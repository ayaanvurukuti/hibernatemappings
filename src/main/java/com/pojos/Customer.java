package com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer custId;
	
	private String custName;
	
	private String custAddress;
	
	private String shipFrom;
	
	private String shipTo;
	
	@Version
	@Column(name = "version")
	private long version;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getShipFrom() {
		return shipFrom;
	}

	public void setShipFrom(String shipFrom) {
		this.shipFrom = shipFrom;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	
	
	

}
