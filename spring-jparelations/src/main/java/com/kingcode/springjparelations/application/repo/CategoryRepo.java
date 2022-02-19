package com.kingcode.springjparelations.application.repo;

import com.kingcode.springjparelations.application.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
