package com.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_contact_number")
    private String employeeContactNumber;

    @Column(name = "employee_address")
    private String employeeAddress;

    @Column(name = "employee_gender")
    private String employeeGender;

    @Column(name = "employee_department")
    private String employeeDepartment;

    @Column(name = "employee_skills")
    private String employeeSkills;


}

