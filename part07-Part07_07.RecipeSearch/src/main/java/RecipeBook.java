/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.ArrayList;
public class RecipeBook {
    private ArrayList<Recipe> recipebook;
    
    public RecipeBook(){
        this.recipebook = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipebook.add(recipe);
    }
    
    public void getRecipeList(){
        for (Recipe temp: recipebook){
            System.out.println(temp.getName() + ", cooking time: " + temp.getDuration());
        }
    }
    
    public void getSimilarRecipeNames(String name){
        for (Recipe temp: recipebook){
            if (temp.getName().contains(name)){
                System.out.println(temp.getName() + ", cooking time: " + temp.getDuration());
            }
        }
    }
    
    public void getRecipesBelowTime(int maxtime){
        for (Recipe temp: recipebook){
            if (temp.getDuration() <= maxtime){
                System.out.println(temp.getName() + ", cooking time: " + temp.getDuration());
            }
        }
    }
    
    public void getRecipesContainingIngredient(String ingredient){
        for (Recipe temp: recipebook){
            if (temp.getIngredients().contains(ingredient)){
                System.out.println(temp.getName() + ", cooking time: " + temp.getDuration());
            }
        }
    }
    
    
}
