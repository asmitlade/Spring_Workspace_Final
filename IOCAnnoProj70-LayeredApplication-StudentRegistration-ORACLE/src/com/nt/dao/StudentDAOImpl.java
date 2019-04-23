package com.nt.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studDAO")
@Scope("singleton")
public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO SP_STUDENT VALUES(SNO_SEQ.NEXTVAL,?,?,?,?,?)";
	
	@Autowired
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