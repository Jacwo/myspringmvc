package com.flashhold.service.impl;

import com.flashhold.annotation.Qualifier;
import com.flashhold.annotation.Service;
import com.flashhold.dao.UserDao;
import com.flashhold.service.UserService;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Qualifier("userDaoImpl")
	private UserDao userDao;
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		userDao.insert();
	}

}
