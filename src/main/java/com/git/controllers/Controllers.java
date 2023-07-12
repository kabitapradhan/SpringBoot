package com.git.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.entity.Employee;
import com.git.repositories.EmpRepository;

@RestController
@RequestMapping("/api")
public class Controllers {
	@Autowired
	private EmpRepository empRepo;
	@GetMapping("/home")
	public String home() {
		return "Thsi is home page";
	}
	@GetMapping("/list")
	public List<Employee> getAllEmpList() {
		List<Employee> list = this.empRepo.findAll();
		return list;
	}
	@GetMapping("/abc")
	public String ABC() {
		return "Thsi is ABC page";
	}


}
