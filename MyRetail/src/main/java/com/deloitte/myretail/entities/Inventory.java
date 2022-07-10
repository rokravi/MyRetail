package com.deloitte.myretail.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {

	@Id
	//auto-incremented
	@Column(length = 10, name = "code") //column name in USER table
	private String code;//field name in User.java class
	
	@Column(length = 100, name = "name")
	private String name;
	
	@Column(length = 100, name = "quantity")
	private String quantity;
	
	@Column(length = 100, name = "unit_price")
	private String  unitPrice;

	public Inventory(String code, String name, String quantity, String unitPrice) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	
	public Inventory(String name, String quantity, String unitPrice) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Inventory [code=" + code + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ "]";
	}
	
	

}
