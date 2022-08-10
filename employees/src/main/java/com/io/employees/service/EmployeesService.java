package com.io.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.employees.dao.EmployeesRepository;
import com.io.employees.model.Employees;
@Service
public class EmployeesService {
	@Autowired
	private EmployeesRepository employeesRepository;

	public Employees demo(Employees employees) {
		Employees emp = employeesRepository.save(employees);
		return emp;
	}

	public Employees fetchEmployee(int id) {
		return employeesRepository.findById(id).get();
	}

	public String deleteEmployees(int id) {
		employeesRepository.deleteById(id);
		return "deleted";
		
	}

	public List<Employees> fetchAllEmployee() {
		return employeesRepository.findAll();
	}

	public Employees updateEmployees(int id, Employees employees) {
		Employees emp =	employeesRepository.findById(id).get();
		emp.setFirstName(employees.getFirstName());
		emp.setLastName(employees.getLastName());
		emp.setAge(employees.getAge());
		employeesRepository.save(employees);
		return emp;
	}

	
	
}
