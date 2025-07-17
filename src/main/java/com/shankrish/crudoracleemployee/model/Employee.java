package com.shankrish.crudoracleemployee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "job_title", length = 100)
    private String jobTitle;

    @Column(name = "salary", precision = 10, scale = 2)
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "department_id", foreignKey = @ForeignKey(name = "fk_department"))
    private Department department;

}

