package com.mac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mac.bo.EmployeeBO;

public class EmployeeDAOImpl3 implements EmployeeDAO {
	private static final String GET_EMP_BY_ID = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE EMPNO = ?";
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl3(JdbcTemplate jt) {
		this.jt = jt;
	}
	public EmployeeBO getEmpDetailsById(int empNo) {
		EmployeeBO  bo = null;
		BeanPropertyRowMapper bprm = null;
		bprm = new BeanPropertyRowMapper(EmployeeBO.class);
		bo = (EmployeeBO) jt.queryForObject(GET_EMP_BY_ID, bprm, empNo);
		return bo;
	}//method
}//class
