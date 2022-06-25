package com.in28minutes.learnspringboot.courses.controller;

import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private int id;
	private String name;
	private String desc;
	
	protected Course() {
		
	}
	
	
	public Course(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
