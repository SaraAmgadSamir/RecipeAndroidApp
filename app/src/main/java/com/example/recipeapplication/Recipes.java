package com.example.recipeapplication;

public class Recipes {
    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;


    public Recipes(String name,String ingredients,String methodTtile,String recipe,int Thumbnail){
       this.RecipeName=name;
        RecipeIngredients=ingredients;
        RecipeMethodTitle=methodTtile;
        Recipe=recipe;
        this.Thumbnail=Thumbnail;
    }
    public String getRecipeName(){
        return RecipeName;
    }
    public String getRecipeIngredients(){
        return RecipeIngredients;
    }
    public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
    }
    public String getRecipe(){
        return Recipe;
    }
    public int getThumbnail(){
        return Thumbnail;
    }



}
