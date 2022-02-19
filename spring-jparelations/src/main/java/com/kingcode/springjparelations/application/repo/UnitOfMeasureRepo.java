package com.kingcode.springjparelations.application.repo;

import com.kingcode.springjparelations.application.entities.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepo extends CrudRepository<UnitOfMeasure, Long> {
}
