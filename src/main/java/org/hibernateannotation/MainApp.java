package org.hibernateannotation;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainApp {
	public static void main(String[] args) {
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		Registration registration = new Registration();
		registration.setId(212);
		registration.setBname("ganga");
		registration.setBdetails("12");
		session.save(registration);
		Registration registration12 = new Registration();
		registration12.setId(2431);
		registration12.setBname("reddi");
		registration12.setBdetails("182");
		session.save(registration12);
		transaction.commit();
		session.close();
//		Registration register = new Registration();
//		register.setId(2431);
//		register.setBname("reddi");
//		register.setBdetails("182");
//		session.save(register);
//		Registration r =new Registration();
//		r.setId(2431);
//		r.setBname("anu");
//		session.delete(r);
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
		
	}
}
