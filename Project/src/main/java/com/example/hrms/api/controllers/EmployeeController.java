package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.entities.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/employee")
public class EmployeeController {


    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "getall")
    public List<Employee> getall() {
        return employeeService.getAll();

    }

    @PostMapping(path = "add")
    public void add(@RequestBody Employee employee) {
        employeeService.add(employee);

    }
}
