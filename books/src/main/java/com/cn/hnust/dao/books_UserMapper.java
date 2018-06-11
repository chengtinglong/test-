package com.cn.hnust.dao;

import com.cn.hnust.pojo.books_User;

public interface books_UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(books_User record);

    int insertSelective(books_User record);

    books_User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(books_User record);

    int updateByPrimaryKey(books_User record);
}