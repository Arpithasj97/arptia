package com.spring;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

public class TestEmployee {
public static void main(String[] args) {
	//Employee e=new Employee
	ApplicationContext beanFactory=new ClassPathXmlApplicationContext("spring.xml");
	
	//BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
Employee e=(Employee) beanFactory.getBean("employee");
Employee e1=(Employee) beanFactory.getBean("employee");
//Employee e2=(Employee) beanFactory.getBean("employee");
	e.setName("IIHT");
	e.setAge(10);
	e1.setName("LEGATO");
	e1.setAge(20);

	e.display();
	e1.display();
	//e2.display();

	System.out.println(Employee.getCounter());
}
}
