package com.kingcode.springmockmvctest.application.repo;

import com.kingcode.springmockmvctest.application.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe, Long> {
}
