package com.curso.spring.controllers;

import com.curso.spring.entities.Supplier;
import com.curso.spring.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    private ISupplierService service;

    @GetMapping("/api/suppliers")
    public List<Supplier> getAll(){

        return service.getAll();
    }

    @GetMapping("/api/supplier/{id}")
    public Supplier get(@PathVariable String id){

        return service.getById(Long.parseLong(id));
    }

    @PostMapping("/api/supplier")
    public void save(@RequestBody Supplier supplier){

        service.save(supplier);
    }

    @DeleteMapping("/api/supplier/{id}")
    public void remove(@PathVariable String id){

        service.remove(Long.parseLong(id));
    }
}
