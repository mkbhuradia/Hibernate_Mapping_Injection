package com.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="employee_one_to_one_dpartment")
public class Employee {
	@Id
	private int employee_id;
	private String employee_name;
	private String employee_address;
	@OneToOne
	@JoinColumn(name="dep_id")
	private Department department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employee_id, String employee_name, String employee_address) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_address = employee_address;
	}

	public Employee(int employee_id) {
		super();
		this.employee_id = employee_id;
	}

	public Employee(int employee_id, String employee_name, String employee_address, Department department) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_address = employee_address;
		this.department = department;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_address="
				+ employee_address + ", department=" + department + "]";
	}
	
}
