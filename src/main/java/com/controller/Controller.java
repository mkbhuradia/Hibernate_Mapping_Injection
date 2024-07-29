package com.controller;

import java.util.Scanner;
import com.utility.Crud_Option_Template;

public class Controller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Wel-Come My Hibernate Mapping-------");
		Main:
		do {
			int no = Crud_Option_Template.crud_option_template(sc);
			switch (no) {
			case 1:
				HibernateController.insertStudent(no);
				break;
			case 2:
				HibernateController.insertStudent(no);
				break;
			case 3:
				HibernateController.insertStudent(no);
				break;
			case 4:
				HibernateController.insertStudent(no);
				break;
			case 5:
				HibernateController.insertStudent(no);
				break;
			case 6:
				HibernateController.insertStudent(no);
				break;
			case 7:
				HibernateController.insertStudent(no);
				break;
			case 8:
				HibernateController.insertStudent(no);
				break;
			case 9:
				System.out.println("-------programme End--------");
				break Main;
			}
		} while (true);

	}
}
