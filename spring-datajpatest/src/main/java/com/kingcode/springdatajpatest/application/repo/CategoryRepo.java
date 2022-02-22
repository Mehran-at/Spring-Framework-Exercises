package com.kingcode.springdatajpatest.application.repo;

import com.kingcode.springdatajpatest.application.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
