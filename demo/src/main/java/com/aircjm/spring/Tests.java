package com.aircjm.spring;

import com.aircjm.spring.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
