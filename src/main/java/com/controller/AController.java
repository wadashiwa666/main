package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ITransferService;
import com.service.IUserService;
import com.vo.User;

@RequestMapping("/")
@Controller
public class AController {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private ITransferService transferService;
	
	@RequestMapping("/a")
	public ModelAndView toA() {
		ModelAndView mav = new ModelAndView("a");
		System.out.println("aaa");
		return mav;
	}
	
	@RequestMapping("/getUsers")
	@ResponseBody
	public String getAllUsers(@RequestParam(required=false,defaultValue="1") Integer startPage,@RequestParam(required=false,defaultValue="2") Integer pageSize) {
		PageHelper.startPage(startPage,pageSize);
		List<User> users = userService.getAllUsers();
		System.out.println("total user count :" + users.size());
		@SuppressWarnings("unused")
		PageInfo<User> pu = new PageInfo<>(users);
		return users.toString();
	}
	
	@ResponseBody
	@RequestMapping("/add")
	public String insertUser(User user) {
		System.out.println(user);
		userService.insert(user);
		return "added";
	}
	
	@ResponseBody
	@RequestMapping("/trans")
	public String trans() {
		transferService.trans(1, "a");
		return "trans";
	}
}
