package com.io.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.employees.model.Employees;
import com.io.employees.service.EmployeesService;
@RestController
public class EmployeesController {
	
	@Autowired
	private EmployeesService employeesService;

	@PostMapping("/saveemployee")
	public Employees test(@RequestBody Employees employees) {
		return employeesService.demo(employees);
  }
	@GetMapping("/getEmployees/{id}")
	public Employees getEmployee(@PathVariable("id")int id) {
		return employeesService.fetchEmployee(id);
		
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id")int id) {
		return employeesService.deleteEmployees(id);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employees> getAllEmployee() {
		return employeesService.fetchAllEmployee();
	}
	
	@PutMapping("/updateEmployee/{id}")
	public Employees updateEmployee(@PathVariable("id")int id,@RequestBody Employees employees) {
		return employeesService.updateEmployees(id,employees);
		
	}
}