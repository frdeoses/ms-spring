package com.curso.spring.controllers;

import com.curso.spring.entities.Custumer;
import com.curso.spring.services.ICustumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustumerController {

    @Autowired
    private ICustumerService service;

    @GetMapping("/api/custumers")
    public List<Custumer> getAll(){

        return service.getAll();
    }

    @GetMapping("/api/custumers/{id}")
    public Custumer get(@PathVariable String id){

        return service.getById(Long.parseLong(id));
    }

    @PostMapping("/api/custumers")
    public void save(@RequestBody Custumer custumer){

        service.save(custumer);
    }

    @DeleteMapping("/api/custumers/{id}")
    public void remove(@PathVariable String id){

        service.remove(Long.parseLong(id));
    }
}
