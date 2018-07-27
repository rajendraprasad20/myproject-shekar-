package com.empServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.dao.Dao;
import com.impl.Iemployee;
import com.shekarpojo.EmpPojo;

public class HibernateServices implements Iemployee{
	@Autowired
	private Dao dao;
	public String Register(EmpPojo p) {
		dao.register(p);
		return "login";
		
	}

	public String Login(EmpPojo p,Model model) {
		List<EmpPojo> list = dao.Login(p);
		model.addAttribute("loginuser", list.get(0));
		if (list.isEmpty()) {
			model.addAttribute("msg", "invalid credentials");
			return "login";
		}
		
		List<EmpPojo> list2 = dao.Getall();
		model.addAttribute("allrecords", list2);
		System.out.println(list2);
		return "profile";
	}

	public String delete(EmpPojo p, String email,Model model) {
		dao.delete(email);

		List<EmpPojo> list2 = dao.Getall();
		model.addAttribute("allrecords", list2);

		return "profile";

	}

	public String EditViewEmp1(EmpPojo p, String email,Model model) {
		List<EmpPojo> editViewEmp1 = dao.EditViewEmp1(p, email);
		model.addAttribute("editview", editViewEmp1.get(0));
		return "editviewform";
	}

	public String update(EmpPojo p,Model model) {
List<EmpPojo> update = dao.update(p);
model.addAttribute("allrecords", update);
return "profile";
	}

	public void multipleRecords(List<String> list) {
		// TODO Auto-generated method stub
		
	}

	

}
