package com.example.RestCrud.dao;

import com.example.RestCrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	// that's it... no need to write any code
	// no need of implementation class

	// get these methods for free - findByAll(), findById(), save(), deleteById(), others....
}
