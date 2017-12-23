package com.jcg.spring.example;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



public class AppMain {
	
	private static BeanFactory beanFactoryObj;
	
	//This Method is used to load the spring bean configuration file and return the 'BeanFactory' object
	
	public static BeanFactory getBeanFactory() {
		beanFactoryObj= new XmlBeanFactory(new ClassPathResource("spring-beans.xml"));
		return beanFactoryObj;
		
	}
	
	//This is the main method and in here we are retrieving the spring Bean via 'getBean()' method
	
	public static void main(String[] args) {
		HelloWorld helloObj= (HelloWorld) getBeanFactory().getBean("helloBean");
		System.out.println(helloObj.getUsername());
	}

}
