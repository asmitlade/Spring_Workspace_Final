package com.mac.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.dto.EmployeeDTO;
import com.mac.dto.StudentDTO;
import com.mac.service.UniversityMgmtService;

@WebServlet("/MainControllerServlet")
public class MainControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ApplicationContext ctx = null;
	UniversityMgmtService uniService = null;
	
	@Override
	public void init()  {
		 //create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		 //get Service class object
		 uniService=ctx.getBean("unsrService",UniversityMgmtService.class);
	}

	 @Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			 String  cap=null;
			 String name=null;
			 String address=null;
			 String email=null;
			 long mobNo=0L;
			 String course=null;
			 String desg=null;
			 StudentDTO stDTO=null;
			 String result=null;
			 EmployeeDTO empDTO=null;
			 RequestDispatcher rd=null;
			 //read form data
			 name=req.getParameter("name");
			 address=req.getParameter("address");
			 email=req.getParameter("email");
			 mobNo=Long.parseLong(req.getParameter("mobNo"));
			 cap=req.getParameter("register");
			 if(cap.equalsIgnoreCase("Register Student")) {
				 course=req.getParameter("course");
				 //prepare STudentDTO
				 stDTO=new StudentDTO();
				 stDTO.setName(name);
				 stDTO.setAddress(address);
				 stDTO.setEmail(email);
				 stDTO.setMobNo(mobNo);
				 stDTO.setCourse(course);
				 //use service
				 result=uniService.registerStudent(stDTO);
			 }
			 else {
				 desg=req.getParameter("desg");
		         //prepare STudentDTO
				 empDTO=new EmployeeDTO();
				 empDTO.setName(name);
				 empDTO.setEmail(email);
				 empDTO.setAddress(address);
				 empDTO.setMobNo(mobNo);
				 empDTO.setDesg(desg);
				 //use service
				 result=uniService.registerEmployee(empDTO);
			 }
			 //keep the results in request scope
			 req.setAttribute("resultMsg",result);
			 //forward request to result page
			 rd=req.getRequestDispatcher("/result.jsp");
			 rd.forward(req,res);
		}
		 
		 @Override
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        doGet(req,res);
		}
		 
		 @Override
		public void destroy() {
			uniService=null;
			((AbstractApplicationContext) ctx).close();
		}
}
