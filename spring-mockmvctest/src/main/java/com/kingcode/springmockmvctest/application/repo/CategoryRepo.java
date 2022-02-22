package com.kingcode.springmockmvctest.application.repo;

import com.kingcode.springmockmvctest.application.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
