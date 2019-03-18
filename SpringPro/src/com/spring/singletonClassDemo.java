package com.spring;

public class singletonClassDemo {
public static void main(String[] args) {
	singletonEmployee e= singletonEmployee.getObject("IIHT");
	singletonEmployee e1= singletonEmployee.getObject("legato");
	singletonEmployee e2= singletonEmployee.getObject("abhi");
	//if(e!=null)
	e.display();
	//if(e1!=null)
	e1.display();
	
	
	//if(e2!=null)
		e2.display();
		System.out.println(e);

	System.out.println(e1);

	System.out.println(e2);
}
}
