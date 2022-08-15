package com.training.spring;

import com.training.spring.java.object.MyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	@Autowired
	private MyObject myObjectBean;

	public void xyz() {
		System.out.println(myObjectBean.hello("osman bean"));
	}
}
