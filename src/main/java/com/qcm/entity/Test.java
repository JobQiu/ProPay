package com.qcm.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// UserDAO userDAO = new UserDAO();
		// User user = new User();
		// user.setName("wqe");
		// user.setPwd("123");
		// Session session = HibernateSessionFactory.getSession();
		// Transaction transaction = session.beginTransaction();
		// session.save(user);
		// transaction.commit();
		// session.close();

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"src/main/java/springmvc-servlet.xml");

	}
}
