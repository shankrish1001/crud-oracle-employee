package com.shankrish.crudoracleemployee.service;

import com.shankrish.crudoracleemployee.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    Department createDepartment(Department department);
    Department updateDepartment(Integer id, Department departmentInfo);
    String deleteDepartment(Integer id);
}
