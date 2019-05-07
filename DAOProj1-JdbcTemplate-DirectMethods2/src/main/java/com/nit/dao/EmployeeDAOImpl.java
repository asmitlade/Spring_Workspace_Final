package com.nit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDAOImpl implements EmployeeDAO {
  
	private static final String GET_EMP_SAL="SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS="SELECT SAL,JOB,ENAME FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_INSERT="INSERT INTO EMP(EMPNO,ENAME,SAL) VALUES(?,?,?)";
	
	@Autowired
	private JdbcTemplate jt;

	/*
	 * public EmployeeDAOImpl(JdbcTemplate jt) { this.jt = jt; }
	 */

	public List<Map<String, Object>> getSalary(int no) {
		List<Map<String, Object>> salary=jt.queryForList(GET_EMP_SAL,no);
		return salary;
	}

	public List<Map<String, Object>> getEmpDetailsByEmpno(int eno) {
		List<Map<String,Object>> Details=jt.queryForList(GET_EMP_DETAILS,eno);
				
		return Details;
	}

	
	
	
	
	
}
