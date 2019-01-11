package migi.spring5framework.recipe.controllers;

import migi.spring5framework.recipe.domain.Recipe;
import migi.spring5framework.recipe.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IndexControllerTest {

    IndexController controller;

    @Mock
    private RecipeService recipeService;

    @Mock
    private Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        controller = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {

//        Set<Recipe> recipes = new HashSet<>();
//        recipes.add(new Recipe());

//        when(recipeService.getRecipes()).thenReturn(recipes);
//
//        assertEquals(recipes.size(), 1);

        assertEquals(controller.getIndexPage(model), "index");

        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), anySet()); // TODO
    }
}