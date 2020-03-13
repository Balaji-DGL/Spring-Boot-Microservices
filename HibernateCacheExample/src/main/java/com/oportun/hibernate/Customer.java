package com.oportun.hibernate;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="Customer")
public class Customer implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="cust_id", nullable = false)
	private int cust_id;
	
	@Column(name="cust_name", nullable = true)
	private String cust_name;
	
	@Column(name="cust_address", nullable = true)
	private String cust_address;
	
	@Column(name="cust_phonenum", nullable = true)
	private int cust_phonenum;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public int getCust_phonenum() {
		return cust_phonenum;
	}

	public void setCust_phonenum(int cust_phonenum) {
		this.cust_phonenum = cust_phonenum;
	}

}
