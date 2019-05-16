package com.mac.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jt;
	
	public List<Map<String, Object>> searchEmpByDesg(String condition) {
		List<Map<String, Object>> list = null;
		list = jt.queryForList("SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE JOB IN "+condition);
		return list;
	}

}
