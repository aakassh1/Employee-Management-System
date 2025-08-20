package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;

@RestController
@RequestMapping("/employee/")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	public Employee saveDefaultEmployee(@RequestBody Employee employee) {
		return employeeService.saveDefaultEmployee(employee);
	}
	
	@GetMapping("getById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("getAll")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Employee deleted successfully";
	}

}
