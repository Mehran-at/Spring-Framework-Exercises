package com.kingcode.springmockmvctest.application.service;

import com.kingcode.springmockmvctest.application.entities.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
