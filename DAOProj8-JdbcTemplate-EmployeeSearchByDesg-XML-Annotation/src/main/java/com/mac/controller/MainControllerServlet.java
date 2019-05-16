package com.mac.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.service.EmployeeMgmtService;

@WebServlet(urlPatterns="/controller",loadOnStartup=1)
public class MainControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	ApplicationContext ctx = null;
	EmployeeMgmtService service = null;
	@Override
	public void init() throws ServletException {
		//create IOC Container object
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		//get bean
		service = ctx.getBean("empService", EmployeeMgmtService.class);
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String[] job = null;
		List<Map<String, Object>> list = null;
		RequestDispatcher rd = null;
		//get request param
		job = req.getParameterValues("job");
		//use service 
		list = service.findEmpDetailsByDesg(job);
		//set data into request attribute
		req.setAttribute("jobList", list);
		//forward request 
		rd = req.getRequestDispatcher("/display_result.jsp");
		rd.forward(req, res);
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-)
	
	@Override
	public void destroy() {
		service = null;
		((AbstractApplicationContext) ctx).close();
		
	}
}
