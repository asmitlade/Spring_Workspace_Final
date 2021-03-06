package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO SP_STUDENT VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl: 0-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) {
		System.out.println("StudentDAOImpl.insert()");
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		// JDBC code to insert record
		try {
			// get JDBC connection
			con = ds.getConnection();
			// create PreparedStatement object
			ps = con.prepareStatement(STUDENT_INSERT_QUERY);
			// set values to Query params
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getSname());
			ps.setString(3, bo.getSaddrs());
			ps.setInt(4, bo.getTotal());
			ps.setFloat(5, bo.getAvg());
			ps.setString(6, bo.getResult());
			// execute the Query
			result = ps.executeUpdate();
			return result;
		}
		catch(SQLException se) {
			return 0;
		}
		catch(Exception e) {
			return 0;
		}
	}//method
}//class