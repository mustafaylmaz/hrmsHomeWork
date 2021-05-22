package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.dataAccess.abstracts.UserDao;
import com.example.hrms.entities.Employee;
import com.example.hrms.entities.User;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@NoArgsConstructor
@Service
public class EmployeeManager implements EmployeeService {



    private EmployeeDao employeeDao;

    @Autowired(required = false)
    public EmployeeManager(EmployeeDao employeeDao) {


        this.employeeDao = employeeDao;

    }

    @Override
    public void add(Employee employee) {
    this.employeeDao.save(employee);
    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public List<Employee> getAll() {
        return this.employeeDao.findAll();
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void getById(int employee_id) {

    }


}
