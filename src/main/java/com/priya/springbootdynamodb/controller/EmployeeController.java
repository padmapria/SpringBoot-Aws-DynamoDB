package com.priya.springbootdynamodb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priya.springbootdynamodb.entity.Employee;
import com.priya.springbootdynamodb.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    private EmployeeRepository repository;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/{employeeId}")
    public Optional<Employee> findPerson(@PathVariable String employeeId) {
        return repository.findByEmployeeId(employeeId);
    }
    
    @GetMapping("/all")
    public Iterable<Employee> findAll(){
        return repository.findAll();
    }

    @DeleteMapping
    public void deleteEmployee(@RequestBody Employee employee) {
        repository.delete(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
    
    @GetMapping("/test")
    public String testApp() {
        return "Application started";
    }
}
