package com.example.swaggerDemo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	public static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
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
		logger.info("确认正常！");
		return listUserVos;
	}
}
