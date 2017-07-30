package com.my;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class StoreStudent {

	public static void main(String[] args) {
		// using single line to create session object ...as shown 1st program.
Session session=new Configuration().configure().buildSessionFactory().openSession();

  Student std=new Student();
  std.setName("nikhil");
  session.save(std);
  session.beginTransaction().commit();
  System.out.println("success");
  
	}

}
