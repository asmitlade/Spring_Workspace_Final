package com.mac.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mac.bo.EmployeeBO;

public class EmployeeDAOImpl2 implements EmployeeDAO {
	private static final String GET_EMP_BY_ID = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE EMPNO = ?";
	private static final String GET_EMP_BY_DESG = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE job = ?";
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl2(JdbcTemplate jt) {
		this.jt = jt;
	}
	public EmployeeBO getEmpDetailsById(int empNo) {
		EmployeeBO  bo = null;
		bo = jt.queryForObject(GET_EMP_BY_ID, (ResultSet rs, int rowNum)->{

				EmployeeBO bo1 = null;
				bo1 = new EmployeeBO();
				bo1.setEmpNo(rs.getInt(1));
				bo1.setEname(rs.getString(2));
				bo1.setJob(rs.getString(3));
				bo1.setSal(rs.getInt(4));
				
				return bo1;
		}
		, empNo);
	return bo;
	}
	
	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String job) {
		List<EmployeeBO> listEmp = null;
		listEmp = jt.query(GET_EMP_BY_DESG, (rs)->{List<EmployeeBO> list = null;
		list = new ArrayList<EmployeeBO>();
		while(rs.next()) {
			EmployeeBO bo = new EmployeeBO();
			bo = new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getInt(4));
			list.add(bo);
			}
		return list;
		}
		, job);
		return listEmp;
	}//method
}//class
