package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.formation.inti.entity.Employee;
import fr.formation.inti.entity.User;
import fr.formation.inti.service.IEmployeeService;
import fr.formation.inti.service.IUserService;

@Controller
public class IndexController {
	
	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private IUserService sv;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", "Hello spring MVC");
		return "login";
	}
	
	@RequestMapping(value = "/home",method = RequestMethod.POST)
	public String home2(Model model,
			@RequestParam("login") String login ,
			@RequestParam("password") String password ) {
		User u = sv.findByLoginAndPassword(login, password);
		Employee e = u.getEmp();
		model.addAttribute("employee",e);
		return "home";
	}
	
	@RequestMapping(value = "/english",method = RequestMethod.POST)
	public String english(Model model ) {
		
		model.addAttribute("message","Hello welcome on spring mvc");
		return "home";
	}
	
}
