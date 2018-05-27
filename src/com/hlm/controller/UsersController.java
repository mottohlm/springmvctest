package com.hlm.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;

import com.hlm.command.UsersCommand;




@Controller
public class UsersController {
	
	
	@RequestMapping("/sigup.do")                                                                
	public ModelAndView  sigup(HttpServletRequest req){ 
		 ModelAndView mv = new ModelAndView();
		 
		UsersCommand cmd = new UsersCommand("ะกร๗",0,"admin@hlm.com",1,"123456" );
	    
		 req.getSession().setAttribute("user", cmd);
		 mv.addObject("password", cmd.getPassword());
		 mv.addObject("userName", cmd.getUserName());
		 System.out.println(cmd.getPassword());
		 mv.setViewName("index");
	   return mv;
	}


}
