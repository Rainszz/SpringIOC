package com.rains.spring.bean;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	@Test
	public void test() {
		System.out.println("**********spring容器控制XML配置文件实现*********");
		//先获取容器对象
		ApplicationContext context1 = 
				new ClassPathXmlApplicationContext
				("applicationContext01.xml");
		//通过容器来获取bean对象
		Student stu1 = context1.getBean(Student.class);
		//使用bean对象
		stu1.setAddress("周口");//不使用注解
		//使用
		System.out.println(stu1.getSid()+"\t"+stu1.getName()+"\t"+stu1.getSex());
		System.out.println("**********spring容器控制注解方式实现*********");
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext01.xml");
		Student stu = context.getBean(Student.class);
		stu.setAddress("河南");
		System.out.println(stu.getAddress());
		
	}

}
