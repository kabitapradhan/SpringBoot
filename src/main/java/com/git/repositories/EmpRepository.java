package com.git.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
