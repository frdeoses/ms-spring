package com.curso.spring.services;

import com.curso.spring.entities.Supplier;

import java.util.List;

public interface ISupplierService {

    List<Supplier> getAll();

    Supplier getById(Long id);

    void remove(Long id);

    void save(Supplier custumer);
}
