package com.mac.dao;

import com.mac.bo.EmployeeBO;
import com.mac.bo.StudentBO;

public class UniversityDAOImpl implements UniversityDAO {

	public UniversityDAOImpl() {
		System.out.println("UniversityDAOImpl : 0-param constructor");
	}
	@Override
	public int insertStudentData(StudentBO bo) {
		System.out.println("Insert Student Data ::"+bo);
		return 1;
	}

	@Override
	public int insertEmployeeData(EmployeeBO bo) {
		System.out.println("Insert Employee Data ::"+bo);
		return 1;
	}

}
