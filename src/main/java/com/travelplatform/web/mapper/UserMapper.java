package com.travelplatform.web.mapper;

import com.travelplatform.web.po.User;

public interface UserMapper {
    public User findUser(String userCode, String password);
    public void insertUser(String userCode, String password);
    public User findUserByCode(String userCode);
    public User findUserById(Integer userId);
}
