package com.pw.tc.user.service;

import com.pw.tc.user.dao.UserDao;
import com.pw.tc.user.dao.UserDaoImpl;
import com.pw.tc.user.pojo.User;

public class UserServiceImpl implements UserService{
	private UserDao userdao = new UserDaoImpl();
	@Override
	public boolean existsUsername(String username) {
		if(userdao.queryUserByUsername(username)==null) {
			//�p�G�S���d��Τ�W�l�A�N��i�H�ϥΡA�Ǧ^false ��ܥi�H���U���Τ�W
			return false;
		}		
		return true;
	}
	@Override
	public User login(User user) {
		
		return userdao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
	}
	@Override
	public void registered(User user) {
		userdao.saveUser(user);
		
		
	}
	
}
