package com.example.demo1.controller;
import com.example.demo1.domain.JsonData;
import com.example.demo1.domain.User;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.service.UserService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**

 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * 功能描述: user 保存接口
	 * @return
	 */
	@GetMapping("add")
	public Object add(){
		User user = new User();
//		user.setAge(11);
//		user.setCreateTime(new Date());
//		user.setName("xdclass");
//		user.setPhone("10010000");
		user.setDgh(100);
		user.setMax_gh(99);
		user.setName("8080_u_p");
		user.setNumber(98);
		user.setWeight(97);
		int id = userService.add(user);
		
       return JsonData.buildSuccess(id);
	}
	
	@Autowired
	private UserMapper userMapper;
	@GetMapping("findAll")
	public Object findAll(){
       return JsonData.buildSuccess(userMapper.getAll());
	}
//	
//	
//	通过id进行查询
	@GetMapping("findById")
	public Object findById(long id){
       return JsonData.buildSuccess(userMapper.findById(id));
	}
	//通过名称查询
	@GetMapping("findByName")
	public Object findByName(@Param("name")String name){
		
		System.out.println(userMapper.findByName(name));
		System.out.println(String.valueOf(name));
		System.out.println(name.toString());
       return JsonData.buildSuccess(userMapper.findByName(name));
       
	}
	
	//通过数量查询
	@GetMapping("findByNumber")
	public Object findByNumber(int number)
	{
		return JsonData.buildSuccess(userMapper.findByNumber(number));
		
	}
	
	
//	
	@GetMapping("del_by_id")
	public Object delById(long id){
	userMapper.delete(id);
       return JsonData.buildSuccess();
	}
//	
	@GetMapping("update")
	public Object update(int id,int number){
		User user = new User();
		user.setNumber(number);
		user.setId(id);
		userMapper.update(user);
	    return JsonData.buildSuccess();
	}
	
	@GetMapping("test")
	public String toString()
	{
		return "hello world";
	}
//	
	
	
	
	
	
//	//测试事务
//	@GetMapping("transac")
//	public Object transac(){
//		int id = userService.addAccount();
//	    return JsonData.buildSuccess(id);
//	}
//	
//	
	
	
}
