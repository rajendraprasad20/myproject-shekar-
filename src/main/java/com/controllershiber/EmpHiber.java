package com.controllershiber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.empServices.HibernateServices;
import com.shekarpojo.EmpPojo;
@Controller
public class EmpHiber {
	@Autowired
	private HibernateServices hs;
	@RequestMapping(value = "/reg", method=RequestMethod.POST)
	public String register(EmpPojo p) {
		System.out.println("ENtered");
		String register = hs.Register(p);
		return register;
		
	}
	@RequestMapping(value = "/login")
	public String login(EmpPojo p,Model model) {
		System.out.println("ENtered into login");
		String login = hs.Login(p, model);
		return login;
	}
	@RequestMapping(value = "/deleteemp")
	public String delete(EmpPojo p,@RequestParam("deleteemp") String email,Model model) {
System.out.println("entering into delete");
String delete = hs.delete(p, email, model);
return delete;
		
	}
	@RequestMapping(value = "/editviewEmp")
	public String editviewEmp(EmpPojo p, @RequestParam("editviewemp") String email,Model model) {
		String editViewEmp1 = hs.EditViewEmp1(p, email, model);
		return editViewEmp1;

	}
	@RequestMapping(value = "/update")
	public String update(EmpPojo p,Model model) {
		String update = hs.update(p, model);
		return update;

	}
}

