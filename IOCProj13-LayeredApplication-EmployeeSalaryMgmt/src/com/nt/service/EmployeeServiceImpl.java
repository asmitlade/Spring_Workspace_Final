package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String salaryCal(EmployeeDTO dto) {
		// write B.logic
		EmployeeBO bo = null;
		double payBand = 9300;
		double gradePay = 3200;
		double da = ((payBand + gradePay)*125)/100;
		double hra = ((payBand + gradePay)*10)/100;
		double gsal = dto.getBsal()+da+hra;
		double ns = (gsal * 10)/100;
		double nsal = gsal - ns;
		int cnt = 0;
		// create BO class object
		bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setJob(dto.getJob());
		bo.setBsal(dto.getBsal());
		bo.setGsal(gsal);
		bo.setNsal(nsal);
		// use DAO
		cnt = dao.insert(bo);
		if(cnt == 0)
			return "Employee does not exits";
		else
			return "Employee Salary Calculated ::"+"\nGross Salary ::"+bo.getGsal()+"\nNet Salary ::"+bo.getNsal();
	}//method
}//class
