package com.pw.tc.user.service;

import com.pw.tc.user.pojo.User;

public interface UserService {
	
	
	/**
	 * ���U�Τ�
	 * @param user
	 * 
	 * */
	public void registered(User user) ;
	
	/**
	 * �n�J�Τ�
	 * @param user
	 * @return 
	 * */
	public User login(User user) ;
	
	/**
	 * �ˬd�Τ�W�O�_�s�b
	 * @param user
	 * @return ��^True ��ܥΤ�W�s�b�A��^false ��ܥΤ�W���s�b�A�i�ϥΡC
	 * */
	public boolean existsUsername(String username) ;
}
