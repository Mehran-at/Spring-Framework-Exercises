package com.kingcode.springjparelations.application.repo;

import com.kingcode.springjparelations.application.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe, Long> {
}
