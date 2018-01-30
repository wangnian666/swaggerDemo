/**
 * 
 */
package com.example.swaggerDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangxu 
 * @create 2018年1月15日下午4:24:26
 * @version 1.0
 * 
 */
@Api("swagger测试")
@RestController
@RequestMapping(value="/swagger")
public class DemoController {
	
	@ApiOperation(value="方法测试",notes="根据传参返回对应的值")
	@ResponseBody
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String word( @RequestParam("word") String word){
		return word;
	} 
	
	
}
