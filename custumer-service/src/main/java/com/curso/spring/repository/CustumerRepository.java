package com.curso.spring.repository;

import com.curso.spring.entities.Custumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustumerRepository extends CrudRepository<Custumer,Long> {
}
