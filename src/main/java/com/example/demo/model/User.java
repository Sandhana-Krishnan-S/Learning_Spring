package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int mark;
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
}
