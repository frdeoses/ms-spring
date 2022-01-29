package com.curso.spring.services;

import com.curso.spring.entities.Supplier;
import com.curso.spring.repository.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService{

    @Autowired
    private SuppliersRepository repository;

    @Override
    public List<Supplier> getAll(){

        return (List<Supplier>) repository.findAll();

    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {

        repository.deleteById(id);

    }

    @Override
    public void save(Supplier custumer) {
        repository.save(custumer);
    }
}
