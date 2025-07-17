package com.shankrish.crudoracleemployee.service.impl;

import com.shankrish.crudoracleemployee.model.Employee;
import com.shankrish.crudoracleemployee.repository.EmployeeRepository;
import com.shankrish.crudoracleemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee employeeInfo) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        employee.setFirstName(employeeInfo.getFirstName());
        employee.setLastName(employeeInfo.getLastName());
        employee.setDateOfBirth(employeeInfo.getDateOfBirth());
        employee.setGender(employeeInfo.getGender());

        employee.setGender(employeeInfo.getGender());
        employee.setEmail(employeeInfo.getEmail());
        employee.setPhone(employeeInfo.getPhone());
        employee.setHireDate(employeeInfo.getHireDate());

        employee.setJobTitle(employeeInfo.getJobTitle());
        employee.setSalary(employeeInfo.getSalary());
        employee.setDepartment(employeeInfo.getDepartment());

        return employeeRepository.save(employee);
    }

    public String deleteEmployee(Integer id) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Record deleted";
        } else {
            return "Record not found";
        }

    }

}

