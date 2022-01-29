package com.curso.spring.repository;

import com.curso.spring.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliersRepository extends CrudRepository<Supplier,Long> {
}
