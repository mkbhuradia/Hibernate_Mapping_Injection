package com.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	@Id
	@Column(name="personId")
	private int person_id;
	private String person_name;
	@ManyToMany
	private List<Laptop> laptops;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int person_id, String person_name, List<Laptop> laptops) {
		super();
		this.person_id = person_id;
		this.person_name = person_name;
		this.laptops = laptops;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", laptops=" + laptops + "]";
	}
	

}
