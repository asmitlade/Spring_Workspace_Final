package com.mac.dao;

import com.mac.bo.EmployeeBO;
import com.mac.bo.StudentBO;

public interface UniversityDAO {
	public int insertStudentData(StudentBO bo);
	public int insertEmployeeData(EmployeeBO bo);
}
