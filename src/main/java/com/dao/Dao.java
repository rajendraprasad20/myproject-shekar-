package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.shekarpojo.EmpPojo;
import com.utilhiber.DbHiberUtil;

public class Dao {

	public void register(EmpPojo p) {
		System.out.println("entering into ::register");
		SessionFactory sf = DbHiberUtil.getConnection();
		Session session = sf.openSession();
		session.save(p);
		session.beginTransaction().commit();

	}

	public List<EmpPojo> Login(EmpPojo p) {
		System.out.println("entering into :: list");
		SessionFactory sf = DbHiberUtil.getConnection();
		Session session = sf.openSession();
		Query query = session.createQuery("from EmpPojo where email=:email and password=:pword");
		query.setParameter("email", p.getEmail());
		query.setParameter("pword", p.getPassword());
		List<EmpPojo> list = query.list();
		return list;

	}

	public List<EmpPojo> Getall() {
		System.out.println("entering into :: list");
		SessionFactory sf = DbHiberUtil.getConnection();
		Session session = sf.openSession();
		Query querylist = session.createQuery("from EmpPojo");
		List<EmpPojo> list2 = querylist.list();

		return list2;
	}

	public void delete(String email) {
		SessionFactory sf = DbHiberUtil.getConnection();
		Session session = sf.openSession();
		Query query1 = session.createQuery("delete from EmpPojo where email=:email");
		query1.setParameter("email", email);
		int count = query1.executeUpdate();
		System.out.println("count:" + count);
		session.beginTransaction().commit();

	}

	public List<EmpPojo> EditViewEmp1(EmpPojo p, String email) {
		SessionFactory sf = DbHiberUtil.getConnection();
		Session session = sf.openSession();
		Query query = session.createQuery("from EmpPojo where email=:email");
		query.setParameter("email", email);
		List<EmpPojo> list = query.list();
		return list;
		
	}
	public List<EmpPojo> update(EmpPojo p) {
		SessionFactory sf = DbHiberUtil.getConnection();
		Session session = sf.openSession();
		session.saveOrUpdate(p);
		session.beginTransaction().commit();
		Query query = session.createQuery("from EmpPojo");
		List<EmpPojo> list = query.list();
		//session.createQuery("update from EmpPojo set name=:name,mobile=:mobile,password=:password where email=:email");
		return list;

		
	}
}
