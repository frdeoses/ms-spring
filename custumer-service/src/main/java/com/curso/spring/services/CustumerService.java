package com.curso.spring.services;

import com.curso.spring.entities.Custumer;
import com.curso.spring.repository.CustumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustumerService implements ICustumerService{

    @Autowired
    private CustumerRepository repository;

    @Override
    public List<Custumer> getAll(){

        return (List<Custumer>) repository.findAll();

    }

    @Override
    public Custumer getById(Long id) {
        return (Custumer) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {

        repository.deleteById(id);

    }

    @Override
    public void save(Custumer custumer) {
        repository.save(custumer);
    }
}
