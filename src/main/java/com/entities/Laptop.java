package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="laptop")
public class Laptop {
	@Id
	@Column(name="laptopId")
	private int laptop_id;
	private String laptop_componyName;
	@ManyToMany
	private List<Person> persons;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int laptop_id, String laptop_componyName, List<Person> persons) {
		super();
		this.laptop_id = laptop_id;
		this.laptop_componyName = laptop_componyName;
		this.persons = persons;
	}
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getLaptop_componyName() {
		return laptop_componyName;
	}
	public void setLaptop_componyName(String laptop_componyName) {
		this.laptop_componyName = laptop_componyName;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	@Override
	public String toString() {
		return "Laptop [laptop_id=" + laptop_id + ", laptop_componyName=" + laptop_componyName + ", persons=" + persons
				+ "]";
	}
	
}
