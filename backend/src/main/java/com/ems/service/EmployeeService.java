package com.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployeeById(int id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

	public Employee saveDefaultEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee updateEmployee(int id, Employee employee) {
		Employee emp = getEmployeeById(id);
		
		if(emp!=null) {
			emp.setName(employee.getName());
			emp.setEmail(employee.getEmail());
			emp.setCompany(employee.getCompany());
			emp.setDepartment(employee.getDepartment());
			emp.setSalary(employee.getSalary());
			emp.setDob(employee.getDob());
			emp.setDateOfJoining(employee.getDateOfJoining());
			
			return employeeRepository.save(emp);
			
		}
		
		return null;
	}

}
