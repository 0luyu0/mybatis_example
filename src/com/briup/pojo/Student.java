package com.briup.pojo;


public class Student {
	private Integer id;
	private String name;
	private String clas;
	
	public Student() {
		System.out.println("无参构造器");
	}
	
	public Student(Integer id, String name, String clas) {
		System.out.println("有参构造器");
		this.id = id;
		this.name = name;
		this.clas = clas;
	} 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clas=" + clas + "]";
	}
}
