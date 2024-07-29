package com.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="department_id")
	private int department_id;
	private String department_name;
	private String department_address;
	@OneToOne(mappedBy="department")
	@JoinColumn(name="emp_id")
	private Employee employee;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int department_id) {
		super();
		this.department_id = department_id;
	}


	public Department(int department_id, String department_name, String department_address, Employee employee) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.department_address = department_address;
		this.employee = employee;
	}
	public Department(int department_id, String department_name, String department_address) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.department_address = department_address;
		
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_address() {
		return department_address;
	}
	public void setDepartment_address(String department_address) {
		this.department_address = department_address;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name
				+ ", department_address=" + department_address + ", employee=" + employee + "]";
	}

	
	

	
}
