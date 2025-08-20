package com.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ems.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

//	@Query(value = "insert into employees(id,name,email,company,department,salary,dob,dateOfJoining) values(")
//	public Optional<Employee> saveDefaultEmployee(Employee emp);
	
}
