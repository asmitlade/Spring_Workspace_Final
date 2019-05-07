package com.mac.dao;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMP_COUNT_QUERY = "SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_NAME_BY_ID = "SELECT ENAME FROM EMP WHERE EMPNO = ?";
	private static final String GET_EMP_BY_ID = "SELECT ENAME, JOB, SAL FROM EMP WHERE EMPNO = ?";
	private static final String GET_EMP_BY_DESG = "SELECT ENAME, JOB, SAL FROM EMP WHERE JOB = ?";
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(EMPNO_SEQ.NEXTVAL,?,?,?)";
	private static final String UPDATE_EMPLOYEE_DESG = "UPDATE EMP SET JOB = ? WHERE EMPNO = ?";
	private static final String DELETE_EMP_BY_EMPNO = "DELETE FROM EMP WHERE EMPNO = ?";
	
	@Autowired
	private JdbcTemplate jt;
	
	public int getEmpCount() {
		int count = 0;
		count = jt.queryForObject(EMP_COUNT_QUERY, Integer.class);
		return count;
	}
	public String getEmpNameById(int empNo) {
		String name = null;
		name = jt.queryForObject(GET_EMP_NAME_BY_ID, String.class,  empNo);
		return name;
	}
	public Map<String, Object> getEmpById(int empNo) {
		Map<String, Object> map = null;
		map = jt.queryForMap(GET_EMP_BY_ID,empNo);
		return map;
	}
	public List<Map<String, Object>> getEmpByDesg(String desg) {
		List<Map<String, Object>> list = null;
		list = jt.queryForList(GET_EMP_BY_DESG, desg);
		return list;
	}
	
	public int insert(String ename, String desg, int salary) {
		int  count=0;
		//use DAO
		count=jt.update(INSERT_EMPLOYEE, ename,desg,salary);
		return count;
	}
	public int update(String desg, int empNo) {
		int count = 0;
		count = jt.update(UPDATE_EMPLOYEE_DESG, desg, empNo);
		return count;
	}
	public int delete(int empNo) {
		int count = 0;
		count = jt.update(DELETE_EMP_BY_EMPNO, empNo);
		return count;
	}

}
