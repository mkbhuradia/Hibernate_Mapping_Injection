package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Answer;
import com.entities.Department;
import com.entities.Employee;
import com.entities.Laptop;
import com.entities.Person;
import com.entities.Question;
import com.utility.Utility;

public class HibernateController {
	public static void insertStudent(int no) {
		Configuration cfg = new Configuration().configure("com/hibernate_config_files/hibernate_config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		if (no == 1) {
			Employee emp = Utility.insertStudentTableTemplateEmployee(no);
			Department dep = Utility.insertStudentTableTemplateDepartment(no);
			emp.setDepartment(dep);
			s.save(emp);
			s.save(dep);			
		}
		if (no == 2) {
			Employee emp = Utility.insertStudentTableTemplateEmployee(no);
			Employee emp1 = s.get(Employee.class, emp.getEmployee_id());
			System.out.println(emp1);
		}
		if (no == 3) {
			Employee emp = Utility.insertStudentTableTemplateEmployee(no);
			s.update(emp);
		}
		if (no == 4) {
			Employee emp = Utility.insertStudentTableTemplateEmployee(no);
			s.delete(emp);
		}
		if (no == 5) {
			Employee employee= s.get(Employee.class, 1);
			
		}
		if (no == 6) {
			Employee emp = Utility.insertStudentTableTemplateEmployee(no);
			Department dep = Utility.insertStudentTableTemplateDepartment(no);
			emp.setDepartment(dep);
			dep.setEmployee(emp);
			s.save(emp); 
			s.save(dep); 
		}
		if (no == 7) {
			Question q = Utility.insertStudentTableTemplateQuestion(no);
			List<Answer> list = Utility.insertStudentTableTemplateAnswer(no);
			q.setAnswer(list);
			s.save(q);	
			Answer ans=list.get(0);
			ans.setQuestion(q);
			s.save(ans);
			Answer ans1=list.get(1);
			ans1.setQuestion(q);
			s.save(ans1);
		}
		if (no == 8) {
			List<Person> person = Utility.insertStudentTableTemplatePerson(no);
			List<Laptop> laptop = Utility.insertStudentTableTemplateLaptop(no);
			Person person1=person.get(0);
			Person person2=person.get(1);
			Laptop laptop1=laptop.get(0);
			Laptop laptop2=laptop.get(1);
			person1.setLaptops(laptop);
			person2.setLaptops(laptop);
			laptop1.setPersons(person);
			laptop2.setPersons(person);
			s.save(person1);
			s.save(person2);
			s.save(laptop1);
			s.save(laptop2);	
		}
		tx.commit();
		s.close();
		factory.close();
	}

}
