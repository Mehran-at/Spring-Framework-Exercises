package com.kingcode.springmockmvctest.application.service;

import com.kingcode.springmockmvctest.application.entities.Recipe;
import com.kingcode.springmockmvctest.application.repo.RecipeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepo recipeRepository;

    public RecipeServiceImpl(RecipeRepo recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
