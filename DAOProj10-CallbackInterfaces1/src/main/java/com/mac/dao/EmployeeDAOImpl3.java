package com.mac.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mac.bo.EmployeeBO;

public class EmployeeDAOImpl3 implements EmployeeDAO {
	private static final String GET_EMP_BY_ID = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE EMPNO = ?";
	private static final String GET_EMP_BY_DESG = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE job = ?";
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
