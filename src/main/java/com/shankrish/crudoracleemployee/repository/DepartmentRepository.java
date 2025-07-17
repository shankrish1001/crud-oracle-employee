package com.shankrish.crudoracleemployee.repository;

import com.shankrish.crudoracleemployee.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

