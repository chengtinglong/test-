package com.cn.hnust.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.service.Books_UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private Books_UserService bus;
	@RequestMapping("/showUser")
	public ModelAndView showUser(HttpServletRequest re ,HttpServletResponse res){
		ModelAndView mav = new ModelAndView("/showUser");
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	public void showUser(){
		/*int userId = Integer.parseInt(request.getParameter("id"));
		books_User user = this.bus.getUserById(userId);
		model.addAttribute("user",user);
		return "showUser";*/
		System.out.println("shuchu==================================");
	}
	
}
