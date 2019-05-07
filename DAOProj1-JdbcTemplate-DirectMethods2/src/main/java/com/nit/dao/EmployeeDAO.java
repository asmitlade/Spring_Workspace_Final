package com.nit.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
public List<Map<String, Object>> getSalary(int no);
public List<Map<String, Object>> getEmpDetailsByEmpno(int no);


}
