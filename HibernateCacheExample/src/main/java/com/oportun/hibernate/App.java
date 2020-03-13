package com.oportun.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;

public class App {
	
	public static void main(String[] args) {
		
		Customer cust = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = (Transaction) session.beginTransaction();
		Customer customer = (Customer) session.load(Customer.class, new Integer(10001));
		System.out.println(" Get Customer Name : " + customer.getCust_name());
		
	}
}
