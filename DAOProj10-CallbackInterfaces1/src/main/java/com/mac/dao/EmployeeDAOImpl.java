package com.mac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.mac.bo.EmployeeBO;
@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_BY_DESG = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE job = ?";
	@Autowired
	private JdbcTemplate jt;
	
	/*
	 * public EmployeeDAOImpl(JdbcTemplate jt) { this.jt = jt; }
	 */

	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String job) {
		List<EmployeeBO> listBO = null;
		listBO = jt.query(GET_EMP_BY_DESG, new EmpResultSetExtractor(), job);
		return listBO;
	}//method
	
	private class EmpResultSetExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO = new ArrayList<EmployeeBO>();
			while(rs.next()) {
				EmployeeBO bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getInt(4));
				listBO.add(bo);
			}
			return listBO;
		}
	}
}//class
