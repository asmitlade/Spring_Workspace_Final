package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO SP_STUDENT VALUES(SNO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		// JDBC code to insert record
		try {
			// get JDBC connection
			con = ds.getConnection();
			// create PreparedStatement object
			ps = con.prepareStatement(STUDENT_INSERT_QUERY);
			// set values to Query parameters
			ps.setString(1, bo.getSname());
			ps.setString(2, bo.getSaddrs());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5, bo.getResult());
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