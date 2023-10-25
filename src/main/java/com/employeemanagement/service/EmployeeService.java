package com.employeemanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.employeemanagement.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long emId);
	void deleteEmployeeById(long emId);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
