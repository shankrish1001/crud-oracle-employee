package com.shankrish.crudoracleemployee.service;

import com.shankrish.crudoracleemployee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Integer id, Employee employeeInfo);
    String deleteEmployee(Integer id);
}

