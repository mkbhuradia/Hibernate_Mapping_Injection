package com.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.entities.Answer;
import com.entities.Department;
import com.entities.Employee;
import com.entities.Laptop;
import com.entities.Person;
import com.entities.Question;

public class Utility {
	public static Employee insertStudentTableTemplateEmployee(int no) {
		Employee emp = null;
		int id = 0;
		Scanner sc = new Scanner(System.in);
		if (no >= 1) {
			System.out.print("Pls Enter Employee Id:-");
			id = sc.nextInt();
			emp = new Employee(id);
			emp.setEmployee_id(id);
			sc.nextLine();
			if (no == 2 || no == 4 || no == 5) {
				return emp;
			}
		}
		if (no == 1 || no == 3 || no == 6 || no == 7 || no == 8) {
			System.out.print("Pls Enter Employee Name:-");
			String name = sc.nextLine();
			System.out.print("Pls Enter Employee Address:-");
			String address = sc.nextLine();
			emp = new Employee(id, name, address);
			return emp;
		}
		return emp;
	}
	public static Department insertStudentTableTemplateDepartment(int no) {
		Department dep = null;
		int id = 0;
		Scanner sc = new Scanner(System.in);
		if (no >= 1) {
			System.out.print("Pls Enter Department Id:-");
			id = sc.nextInt();
			dep = new Department(id);
			dep.setDepartment_id(id);
			sc.nextLine();
			if (no == 2 || no == 4 || no == 5) {
				return dep;
			}
		}
		if (no == 1 || no == 3 || no == 6 || no == 7 || no == 8) {
			System.out.print("Pls Enter Department Name:-");
			String name = sc.nextLine();
			System.out.print("Pls Enter Department Address:-");
			String address = sc.nextLine();
			dep = new Department(id, name, address);
			return dep;
		}
		return dep;
	}

	public static Question insertStudentTableTemplateQuestion(int no) {
		Question q = null;
		int id = 0;
		Scanner sc = new Scanner(System.in);
		if (no >= 1) {
			System.out.print("Pls Enter Question Id:-");
			id = sc.nextInt();
			q = new Question(id);
			q.setQuestion_id(id);
			sc.nextLine();
			if (no == 2 || no == 4 || no == 5) {
				return q;
			}
		}
		if (no == 1 || no == 3 || no == 6 || no == 7 || no == 8) {
			System.out.print("Pls Enter Question :-");
			String question = sc.nextLine();
			q = new Question(id, question);
			return q;
		}
		return q;
	}

	public static List<Answer> insertStudentTableTemplateAnswer(int no) {
		List<Answer> listAns = new ArrayList<Answer>();
		int id = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Answer you are Enter:- ");
		int ansNo = sc.nextInt();
		for (int i = 1; i <= ansNo; i++) {
			j++;
			System.out.print("Pls Enter Answer Id:-");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Pls Enter Answer:-");
			String answer = sc.nextLine();

				if (i == 1) {
					Answer ans = new Answer();
					ans.setAnswer_id(id);
					ans.setAnswer(answer);
					listAns.add(ans);
				}
				if (i == 2) {
					Answer ans2 = new Answer();
					ans2.setAnswer_id(id);
					ans2.setAnswer(answer);
					listAns.add(ans2);
				}
			}
		return listAns;
	}
	public static List<Person> insertStudentTableTemplatePerson(int no) {
		List<Person> personList = new ArrayList<Person>();
		int id = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Person you are Enter:- ");
		int pNo = sc.nextInt();
		for (int i = 1; i <= pNo; i++) {
			j++;
			System.out.print("Pls Enter Person Id:-");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Pls Enter Person name:-");
			String personName = sc.nextLine();

				if (i == 1) {
					Person person = new Person();
					person.setPerson_id(id);
					person.setPerson_name(personName);
					personList.add(person);
				}
				if (i == 2) {
					Person person2 = new Person();
					person2.setPerson_id(id);
					person2.setPerson_name(personName);
					personList.add(person2);
				}
			}
		return personList;
	}
	public static List<Laptop> insertStudentTableTemplateLaptop(int no) {
		List<Laptop> lapList = new ArrayList<Laptop>();
		int id = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Laptops you are Enter:- ");
		int lapNo = sc.nextInt();
		for (int i = 1; i <= lapNo; i++) {
			j++;
			System.out.print("Pls Enter laptop Id:-");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Pls Enter laptop compony name:-");
			String lap_com_Name = sc.nextLine();

				if (i == 1) {
					Laptop lap = new Laptop();
					lap.setLaptop_id(id);
					lap.setLaptop_componyName(lap_com_Name);
					lapList.add(lap);
				}
				if (i == 2) {
					Laptop lap2 = new Laptop();
					lap2.setLaptop_id(id);
					lap2.setLaptop_componyName(lap_com_Name);
					lapList.add(lap2);
				}
			}
		return lapList;
	}
}
