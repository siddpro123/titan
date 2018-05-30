package com.sid.hibernet.StudentAddress.StudentAddress;

import java.util.List;
import org.hibernate.Session;
public class HibernetStandAlone {
	
	@SuppressWarnings("unchecked")
	
	public static void main ( String [] args)
	{
		Student student = new Student ("subham","lastname","jee");
		Address address = new Address ("xyz","xyz2","xyz3");
		Session session = HIbernetUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(student);
		address.setId(student.getId());
		student.setAddress(address);
		session.save(student);
		session.getTransaction().commit();
		List<Student> students = (List<Student>)session.createQuery("from Student").list();
		students.forEach(System.out::println);
		session.close();
		System.out.println("session is closed");
	}
}