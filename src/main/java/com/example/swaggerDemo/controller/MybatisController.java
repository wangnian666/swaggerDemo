package com.example.swaggerDemo.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.swaggerDemo.pojo.User;
import com.example.swaggerDemo.service.UserService;
import com.example.swaggerDemo.vo.UserVo;


@RestController
@Api("mybatis测试")
@RequestMapping(value="/mybatis")
public class MybatisController {
	@Autowired UserService userService;
		
		@ApiOperation(value="mybatis查表测试",notes="根据传参查表并返回")
		@ResponseBody
		@RequestMapping(value="/select",method=RequestMethod.GET)
		public List<UserVo> word( @RequestParam("id") Integer id){
			return userService.getUser(id);
		}
}
