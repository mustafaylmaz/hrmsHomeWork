package com.example.hrms.business.abstracts;

import com.example.hrms.entities.Employee;
import com.example.hrms.entities.User;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    void delete(Employee employee);
    List<Employee> getAll();
    void update(Employee employee);
    void getById(int employee_id);



}
