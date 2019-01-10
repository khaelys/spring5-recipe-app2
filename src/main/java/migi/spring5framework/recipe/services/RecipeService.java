package migi.spring5framework.recipe.services;

import migi.spring5framework.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
