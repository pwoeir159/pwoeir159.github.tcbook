package com.pw.tc.user.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pw.tc.user.pojo.User;
import com.pw.tc.user.service.UserService;
import com.pw.tc.user.service.UserServiceImpl;

public class UserServicImplTest {
	UserService userservice = new UserServiceImpl();
	@Test
	public void testExistsUsername() {
		if(userservice.existsUsername("pw123")) {
			System.out.println("�Τ�W�w�s�b");
		}else {
			System.out.println("�Τ�W�w�i��");
		}
	}

	@Test
	public void testLogin() {
		System.out.println(userservice.login(new User(null,"pw123","123",null)));
	}

	@Test
	public void testRegistered() {
		userservice.registered(new User(null,"c1","123","c1@yahoo.com.tw"));
		userservice.registered(new User(null,"c2","123","c2@yahoo.com.tw"));
	}

}
