package com.pw.tc.user.dao;

import com.pw.tc.user.pojo.User;

public interface UserDao {

	
	/*
	 *�ھڥΤ�W�d�ߥΤ��T
	 *@Return �p�G�Onull�����S���o�ӥΤ�C�Ϥ���M
	 */	
	public User queryUserByUsername(String username);	
	/*
	 *�ھڥΤ�W�P�K�X�d�ߥΤ��T
	 *@Return �p�G�Onull�����S���o�ӥΤ�άO�K�X���~�C�Ϥ���M
	 */	
	public User queryUserByUsernameAndPassword(String username,String password);	
	/*
	 *�O�s�Τ�T��
	 *@Return 
	 */	
	public int saveUser(User user);
	/*
	 *�O�s�Τ�T��
	 *@Return 
	 */	
	
}
