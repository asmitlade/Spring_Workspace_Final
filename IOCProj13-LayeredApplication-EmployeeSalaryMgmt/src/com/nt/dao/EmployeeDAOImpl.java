package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO EMPLOYEE VALUES(EMPNO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try{
			//establish the connection
			con = ds.getConnection();
			ps = con.prepareStatement(EMP_INSERT_QUERY);
			// set value to Query parameter
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getJob());
			ps.setDouble(3, bo.getBsal());
			ps.setDouble(4, bo.getGsal());
			ps.setDouble(5, bo.getNsal());
			// execute the Query
			result = ps.executeUpdate();
			return result;
		}
		catch(SQLException se) {
			System.out.println(se.getErrorCode()+se.getMessage());
			return 0;
		}
		catch(Exception e) {
			return 0;
		}
	}//method
}//class
