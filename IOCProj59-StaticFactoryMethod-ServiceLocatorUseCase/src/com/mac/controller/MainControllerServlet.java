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

import com.mac.service.CrickbuzzFindScoreService;

@WebServlet("/MainControllerServlet")
public class MainControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx = null;
	private CrickbuzzFindScoreService localService = null;
	@Override
	public void init() {
		ctx  = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		//get localService class object
		localService = ctx.getBean("localService",  CrickbuzzFindScoreService.class);
				
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int matchId = 0;
		String scoreResult = null;
		RequestDispatcher rd = null;
		//read matchId from input
		matchId = Integer.parseInt(req.getParameter("matchId"));
		//use localService object
		scoreResult = localService.findScore(matchId);
		//keep scoreResult in request scope
		req.setAttribute("scoreBoard", scoreResult);
		//forward to show_score.jsp to display
		rd = req.getRequestDispatcher("/show_score.jsp");
		rd.forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
		localService = null;
		((AbstractApplicationContext) ctx).close();
	}
}
