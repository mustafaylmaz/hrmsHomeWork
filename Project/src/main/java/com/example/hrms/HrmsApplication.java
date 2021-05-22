package com.example.hrms;

import com.example.hrms.business.concretes.EmployeeManager;
import com.example.hrms.entities.Employee;
import com.example.hrms.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(HrmsApplication.class, args);


	}

}
