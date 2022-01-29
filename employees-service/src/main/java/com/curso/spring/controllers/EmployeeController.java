package com.curso.spring.controllers;

import com.curso.spring.entities.Employee;
import com.curso.spring.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @GetMapping("/api/employees")
    public List<Employee> getAll(){

        return service.getAll();
    }

    @GetMapping("/api/employee/{id}")
    public Employee get(@PathVariable String id){

        return service.getById(Long.parseLong(id));
    }

    @PostMapping("/api/employee")
    public void save(@RequestBody Employee employee){

        service.save(employee);
    }

    @DeleteMapping("/api/employee/{id}")
    public void remove(@PathVariable String id){

        service.remove(Long.parseLong(id));
    }
}
