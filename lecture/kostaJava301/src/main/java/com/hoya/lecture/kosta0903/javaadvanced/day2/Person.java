package com.hoya.lecture.kosta0903.javaadvanced.day2;

public class Person {
    private String name;
    private int age;
    private String job;
    
    public Person() {
		// TODO Auto-generated constructor stub
	}
    
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
    
    
}
