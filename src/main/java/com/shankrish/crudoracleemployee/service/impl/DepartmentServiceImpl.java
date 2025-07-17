package com.shankrish.crudoracleemployee.service.impl;

import com.shankrish.crudoracleemployee.model.Department;
import com.shankrish.crudoracleemployee.repository.DepartmentRepository;
import com.shankrish.crudoracleemployee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Integer id, Department departmentInfo) {
        Department department = departmentRepository.findById(id).orElseThrow();
        department.setDepartmentName(departmentInfo.getDepartmentName());
        department.setDepartmentLocation(departmentInfo.getDepartmentLocation());
        return departmentRepository.save(department);
    }

    public String deleteDepartment(Integer id) {
        if(departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
            return "Record deleted";
        } else {
            return "Record not found";
        }

    }

}
