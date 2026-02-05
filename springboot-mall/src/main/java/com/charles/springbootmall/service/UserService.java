package com.charles.springbootmall.service;

import com.charles.springbootmall.dto.UserLoginRequest;
import com.charles.springbootmall.dto.UserRegisterRequest;
import com.charles.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
