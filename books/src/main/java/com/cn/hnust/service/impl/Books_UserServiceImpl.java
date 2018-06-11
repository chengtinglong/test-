package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.books_UserMapper;
import com.cn.hnust.pojo.books_User;
import com.cn.hnust.service.Books_UserService;
@Service("Books_UserService")
public class Books_UserServiceImpl implements Books_UserService {
	@Resource
	private books_UserMapper booksdao;
	@Override
	public books_User getUserById(int userId) {
		
		return booksdao.selectByPrimaryKey(userId);
	}

}
