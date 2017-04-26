package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.service.UserService;


public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "Spring-dubbo-consumer.xml" });
	context.start();
	UserService userService = (UserService) context.getBean("userService");
	String serverIP = RpcContext.getContext().getRemoteHost(); 
	System.out.println(serverIP);
	System.out.println(userService.getUserById(1));
}
}
