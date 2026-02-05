package com.charles.springbootmall.dao;

import com.charles.springbootmall.dto.UserRegisterRequest;
import com.charles.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
