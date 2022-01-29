package com.curso.spring.services;

import com.curso.spring.entities.Custumer;

import java.util.List;

public interface ICustumerService {

    List<Custumer> getAll();

    Custumer getById(Long id);

    void remove(Long id);

    void save(Custumer custumer);
}
