package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.DataSource;

import com.mac.bo.PassangerBO;

public class PassangerDAOImpl implements PassangerDAO {
	private static final String INSERT_QUERY = "INSERT INTO TICKET_RESERVATION VALUES(PID_SEQ.NEXTVAL,?,?,?,?,?)";
	
	private DataSource ds;
	int grpNo = 0;

	public PassangerDAOImpl(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public boolean insert(PassangerBO bo) {
		Connection con = null;
		PreparedStatement ps = null;
		int[] res = null;
		String name=null;
		try {
			//establish the connection
			con = ds.getConnection();
			// create PreapredStatement object
			if(con!=null)
				ps = con.prepareStatement(INSERT_QUERY);
			try(Scanner sc = new Scanner(System.in)){
				System.out.println("Enter Number of Person ::");
				grpNo = sc.nextInt();
				for(int i=0; i<grpNo; ++i) {
					System.out.println("Enter Person Name ::");
					name = sc.next();
					// set values to Query params
					ps.setString(1, name);
					ps.setString(2, bo.getSource());
					ps.setString(3, bo.getDestination());
					ps.setInt(4, bo.getTicket());
					ps.setDouble(5, bo.getAmount());
					ps.addBatch();
				}
			//execute the SQL Query
			res = ps.executeBatch();
			if(res!=null)
				return true; 
			else
				return false;
			}
		}//try
		catch(SQLException se) {
			return false;
		}
	}//method
}//class
