package com.spring;

public class Employee {
	private static int counter=0;
	Employee()
	{
		counter++;
	}
	private String name;
	private int age;
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Employee.counter = counter;
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
	
	
	public void display() {
	        System.out.println("name="+getName());
	        System.out.println("age=" + getAge());
			
	    }

}
