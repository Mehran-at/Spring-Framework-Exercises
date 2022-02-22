package com.kingcode.springmockmvctest.application.repo;

import com.kingcode.springmockmvctest.application.entities.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepo extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
