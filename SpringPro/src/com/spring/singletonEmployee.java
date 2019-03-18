package com.spring;

public class singletonEmployee {

private String name;
 static int counter=0;

 

singletonEmployee(String name) {
	this.name=name;
	counter++;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static int getCounter() {
	return counter;
}
public static void setCounter(int counter) {
	singletonEmployee.counter = counter;
}

 

public static singletonEmployee getObject(String name) {
	if(counter==0)
	return new singletonEmployee(name);
	else
		return null;
}
public void display() {
    System.out.println("name="+this.name);
    System.out.println("counter=" +counter);
	
}
}
