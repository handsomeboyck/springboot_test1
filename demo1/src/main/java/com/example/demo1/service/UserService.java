package com.example.demo1.service;

import org.apache.ibatis.annotations.Param;

import com.example.demo1.domain.User;
public interface UserService {
     public int add(User user);
    
}
