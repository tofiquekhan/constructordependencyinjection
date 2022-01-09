package myproject.constructordepeninjection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.constructordepeninjection.beans.Course;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/constructordepeninjection/resources/applicationContext.xml");
		Course courseBean1 = (Course) context.getBean("courseBean1");
		courseBean1.getCourseDetails();
		Course courseBean2 = (Course) context.getBean("courseBean2");
		courseBean2.getCourseDetails();
		Course courseBean3 = (Course) context.getBean("courseBean3");
		courseBean3.getCourseDetails();
		Course courseBean4 = (Course) context.getBean("courseBean4");
		courseBean4.getCourseDetails();


	}
}
