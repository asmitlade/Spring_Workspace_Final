package com.mac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mac.bo.EmployeeBO;

@Repository("empDAO")
@Scope("singleton")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Inject
	private DataSource ds;
	private static final String FIND_EMP_DETAIL = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

	private EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public List<EmployeeBO> findEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<EmployeeBO> listBO = null;
		EmployeeBO bo = null;
		try {
			//get Pooled JDBC con object
			con = ds.getConnection();
			//create PreapredStatement object
			ps = con.prepareStatement(FIND_EMP_DETAIL);
			// set value to query params
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			//execute SQL Query
			rs = ps.executeQuery();
			//copy ResultSet object records to listBO
			listBO = new ArrayList<EmployeeBO>();
			//process the result
			while(rs.next()) {
				bo = new EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				//add BO class object to List Collection
				listBO.add(bo);
			}//while
		return listBO;
		}//try
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		finally {
			//close jdbc object
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
	}//method
}//class
