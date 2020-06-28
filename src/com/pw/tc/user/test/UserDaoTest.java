package com.pw.tc.user.test;

import static org.junit.Assert.*;

import com.pw.tc.user.dao.*;
import com.pw.tc.user.pojo.*;

import org.junit.Test;

public class UserDaoTest {
	UserDao userdao = new UserDaoImpl();	
	@Test
	public void testQueryUserByUsername() {
		
		if(userdao.queryUserByUsername("123pw123")==null) {
			System.out.println("�Τ�W���s�b");
		}else {
			System.out.println("�Τ�W�w�s�b");
		}
		
	}

	@Test
	public void testQueryUserByUsernameAndPassword() {
		if (userdao.queryUserByUsernameAndPassword("pw123","123")==null) {
			System.out.println("�Τ�W�άO�K�X���~�A�n�J����");
		}else {
			System.out.println("�n�J���\");
		}
	}

	@Test
	public void testSaveUser() {
		System.out.println(userdao.saveUser(new User(null,"p123","123","a@gmail.com")));
	}

}
