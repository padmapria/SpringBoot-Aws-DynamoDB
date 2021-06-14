package com.priya.springbootdynamodb.repo;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priya.springbootdynamodb.entity.Employee;

@Repository	
@EnableScan  
//Without EnableScan findall wontwork
public interface EmployeeRepository extends CrudRepository<Employee, String> {
    
    Optional<Employee> findByEmployeeId(String employeeId);


   


}
