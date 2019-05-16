package com.mac.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.dao.EmployeeDAO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {

	@Autowired
	private EmployeeDAO dao;

	public List<Map<String, Object>> findEmpDetailsByDesg(String[] job) {
		List<Map<String, Object>> list = null;
		StringBuffer sb = null;
		sb = new StringBuffer("(");
		for(int i=0;i<job.length;++i) {
			if(i==job.length-1) {
				sb.append("'"+job[i]+"'");
			}
			else {
				sb.append("'"+job[i]+"',");
			}
		}
		sb.append(")");
		//use DAO
		list = dao.searchEmpByDesg(sb.toString());
		return list;
	}
}
