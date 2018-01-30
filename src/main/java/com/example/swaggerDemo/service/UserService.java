package com.example.swaggerDemo.service;

import java.util.List;

import com.example.swaggerDemo.pojo.User;
import com.example.swaggerDemo.vo.UserVo;

public interface UserService {

	 List<UserVo> getUser(int id);
}
