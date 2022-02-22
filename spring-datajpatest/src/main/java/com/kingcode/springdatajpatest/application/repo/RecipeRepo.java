package com.kingcode.springdatajpatest.application.repo;

import com.kingcode.springdatajpatest.application.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe, Long> {
}
