
package org.greysalman.controller;

import java.util.Map;

import org.greysalman.model.User;
import org.greysalman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Home")
public class HelloWorldController {

	@Autowired
	UserService userService;
	
	/*url: Home/index */
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String UserRegister( ModelMap modal,Map<String,Object> map) {
		modal.addAttribute("msg", "SpringMvc says Hello !");
		map.put("user", new User());
		System.out.println("End of method");
		return "register";
		
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create( User user, Map<String,Object> map) {
	
		//to avoid multiple submissions
		System.out.println("End create"+user);
		userService.create(user);
		//return "redirect:/details/"+ user.getUserId();
		return "redirect: details/"+user.getUserId();
	}
	
	
	
	/*@RequestMapping(value="/contact-us",method=RequestMethod.POST)
	public String sayHi(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("mobileno") String mobileno,
			@RequestParam("skills") String skills,
			Map<String,Object> map) {
		map.put("display_name", name);
		map.put("display_email", email);
		map.put("display_mobileno", mobileno);
		map.put("display_skills", skills);
		System.out.println("End of method2");
		return "details";
		
	}*/
	
	@RequestMapping(value="/details/{userId}", method=RequestMethod.GET)
	public String details(@PathVariable("userId") int userId,Map<String,Object> map) 
	{
		System.out.println("in details");
		User user = userService.find(userId) ;
		map.put("display_name", user.getName());
		map.put("display_email", user.getEmail());
		map.put("display_mobileno", user.getMobileno());
		map.put("display_skills", user.getSkills());
		
		return "details";
		
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String displayall( ModelMap modal,Map<String,Object> map) {
		
		map.put("userList", userService.getAll());
		System.out.println("End of displayall()");
		return "list";
		
	}
	@RequestMapping(value="/edit/{userId}",method=RequestMethod.GET)
	public String edit(@PathVariable("userId") int userId, ModelMap modal,Map<String,Object> map) {
		
		User user =userService.find(userId);
		map.put("user",user);
		System.out.println("End of displayall()");
		return "edit";
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(User user) {
		System.out.println("Start of Update()");
		userService.update(user);
		
		System.out.println("End of Update()");
		return "redirect: details/"+user.getUserId();
		 
	}
	@RequestMapping(value="/delete/{userId}",method=RequestMethod.GET)
	public String delete(@PathVariable("userId") int userId) {
		System.out.println("Start of delete()");
		userService.delete(userId);
		
		System.out.println("End of delete()");
		return "redirect: /Registration/Home/list/";
		
	}
	
	
}
