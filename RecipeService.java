package com.revature.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Recipe;
import com.revature.repository.RecipeRepository;



@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	public RecipeService(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	
	public Recipe createRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}
	
	
	public Optional<Recipe> getRecipeById(Long recipeId) {
		return recipeRepository.findById(recipeId);
	}
	
	
	public List<Recipe> getAllRecipes(){
		return recipeRepository.findAll()
				.stream()
				.toList();
	}
	
	
	public List<Recipe> findByCuisine(String cuisine){
		return recipeRepository.findByCuisine(cuisine);
	}
	
	
	
	public List<Recipe> findByMealType(String mealType){
		return recipeRepository.findByMealType(mealType);
	}
	
	
	 public boolean deleteRecipe(Long recipeId) {
		 Recipe recipe = recipeRepository.getById(recipeId);
		 recipeRepository.delete(recipe);
		 return true;
		
	}
	 
	
	 public List<Recipe> searchRecipes(String query) {
		    return recipeRepository.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(query, query);
		}

	
}
