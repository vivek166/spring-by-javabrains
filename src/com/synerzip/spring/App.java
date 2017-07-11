package com.synerzip.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
