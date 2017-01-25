package org.ycz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ycz.dao.UserMapper;
import org.ycz.entity.User;
import org.ycz.entity.UserExample;

@Service
public class UserService {
	@Autowired
	private UserMapper userDao;
	
	public List<User> list(){
		UserExample e = new UserExample();
		return userDao.selectByExample(e);
	}
}

