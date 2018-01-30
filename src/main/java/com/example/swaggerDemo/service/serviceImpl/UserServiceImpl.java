package com.example.swaggerDemo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swaggerDemo.Dao.UserDao;
import com.example.swaggerDemo.pojo.User;
import com.example.swaggerDemo.service.UserService;
import com.example.swaggerDemo.vo.UserVo;

/**
 * 
 * @author liangxu
 * @create 2018年1月30日下午5:25:45
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public List<UserVo> getUser(int id){
		User user = new User();
		user.setId(id);
		List<User> listUsers =userDao.select(user);
		List<UserVo> listUserVos = new ArrayList<>();
		for(User us:listUsers){
			UserVo userVo = new UserVo();
			userVo.setId(us.getId());
			userVo.setName(us.getName());
			listUserVos.add(userVo);
		}
		return listUserVos;
	}
}
