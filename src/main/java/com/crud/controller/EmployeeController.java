package com.crud.controller;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee((employee));

    }

    @GetMapping("/get/employee")
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }

    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable Integer employeeId){
        return employeeService.getEmployeeById(employeeId);

    }
}
