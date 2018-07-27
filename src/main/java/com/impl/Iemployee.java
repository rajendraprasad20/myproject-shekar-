package com.impl;

import java.util.List;

import org.springframework.ui.Model;

import com.shekarpojo.EmpPojo;

public interface Iemployee {
	
	
	
	public String Register(EmpPojo p);
	public String Login(EmpPojo p,Model model);
	public String delete(EmpPojo p,String email,Model model);
	public String EditViewEmp1(EmpPojo p,String email,Model model) ;
	public String update(EmpPojo p,Model model) ;
	public void multipleRecords(List<String> list);
	
}
