package com.oportun.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegirstry;

	static {

		try {

			Configuration config = new Configuration();
			config.configure();
			serviceRegirstry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegirstry);

		} catch (Throwable ex) {
			System.err.println(" Session Factory could not created : " + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
