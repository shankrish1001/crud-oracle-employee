package com.shankrish.crudoracleemployee.repository;

import com.shankrish.crudoracleemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

