package com.cn.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.books_User;
import com.cn.hnust.service.Books_UserService;

@RunWith(SpringJUnit4ClassRunner.class)    //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

	private static  Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private Books_UserService bus = null;
	
	@Test
	public void test1(){
		books_User user = bus.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}

}


