package com.cg.springmvc.controller;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.cg.springmvc.bean.User;

	@Controller
	public class SpringController {
		
		@Autowired
		private ServletContext context;
		@RequestMapping("/hello")
		public String hello(ModelMap map) {
			map.addAttribute("msg","Hello world...........");
			return "index";
		}
		//@RequestMapping(path="/query",method = RequestMethod.GET)
		@GetMapping("/query")
		public String query(@RequestParam(name="name",required=false)String name,
				@RequestParam(name="age",required=false)Integer age,ModelMap map) {
			map.addAttribute("name",name);
			map.addAttribute("age",age);
			return "query";
		}
		@GetMapping("/form")
		public String form() {
			return "form";
		}

		/*
		 * @PostMapping("/form") public String form(String name,String email, String
		 * password,String gender,ModelMap map) { map.addAttribute("name",name);
		 * map.addAttribute("email",email); map.addAttribute("password",password);
		 * map.addAttribute("gender",gender); return "form"; }
		 */
		@PostMapping("/form")
		public String form(User user,ModelMap map) {
			map.addAttribute("name",user.getName());
			map.addAttribute("email",user.getEmail());
			map.addAttribute("password",user.getPassword());
			map.addAttribute("gender",user.getGender());
			return "form";
		}
		
		@GetMapping("/createCookie")
		public String createCookie(HttpServletResponse resp) {
			Cookie cookie = new Cookie("name", "Shakthy");
			return "createcookie";
		}
		
		@GetMapping("/getCookie")
		//public String getCookie(HttpServletRequest request) {
		public String getCookie(@CookieValue(name = "name", required = false)String name,
								ModelMap map) {
			
			if(name != null) {
				map.addAttribute("name", name);
			}else {
				map.addAttribute("name", "Sharanyaa");
			}
			
			return "getCookie";
		}
		
		@GetMapping("/path/{movie}/{hero}")
		public String path(@PathVariable("movie")String movie,
						   @PathVariable("hero")String hero,
						   ModelMap map) {
			
			map.addAttribute("movie", movie);
			map.addAttribute("hero", hero);
			return "pathValue";
		}
		
		@GetMapping("/forward")
		public String forward() {
			return "forward:hello";
		}
		
		@GetMapping("/redirect")
		public String redirect() {
			return "redirect:https://www.google.com";
		}
		
		@GetMapping("/login")
		public String login() {
			return "login";
		}
		
		@PostMapping("/login")
		public String login(HttpServletRequest request, String username, String password,
							ModelMap  map) {
			if(username.equals("user") && password.equals("qwerty")) {
				User user= new User();
				user.setName(username);
				user.setEmail("user@gmail.com");
				user.setPassword(password);
				user.setGender("o");
				
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				
				map.addAttribute("msg", "user logged in");
				return "home";
			}else {
			    map.addAttribute("msg", "Invalid credentials");
			    return "login";
			}
			
		}
		
		
//		@PostMapping("/login")
//		public String login(String username, String password,
//							HttpSession session,ModelMap map) {
//			if(username.equals("user") && password.equals("qwerty")) {
//				map.addAttribute("msg", "user logged in");
//				return "home";
//			}else {
//				session.invalidate();
//			    map.addAttribute("msg", "Invalid credentials");
//			    return "login";
//			}
//		}
		
		@GetMapping("home")
		public String home(@SessionAttribute(name="user", required = false)User user) {
			if(user!=null) {
				return "home";
			}else {
				return "login";
			}
		}
		
		@GetMapping("setappattribute")
		public String setAppAttribute() {
			context.setAttribute("msg", new Object());
			return "setcontext";
		}
		
		@GetMapping("getappattribute")
		public String getAppAttribute() {
			System.out.println(context.getAttribute("msg"));
			return "getcontext";
		}

	}
