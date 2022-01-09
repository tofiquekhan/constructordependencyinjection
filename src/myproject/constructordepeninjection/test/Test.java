package myproject.constructordepeninjection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.constructordepeninjection.beans.Course;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/constructordepeninjection/resources/applicationContext.xml");
		
		Course courseBean = (Course) context.getBean("courseBean");
		courseBean.getCourseDetails();


	}
}
