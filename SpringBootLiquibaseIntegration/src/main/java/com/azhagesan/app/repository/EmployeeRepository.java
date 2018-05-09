package com.azhagesan.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.azhagesan.app.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
