package com.io.employees.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.employees.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

	Employees save(int id);

}
