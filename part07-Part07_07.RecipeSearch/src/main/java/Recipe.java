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

public class Recipe {
    private String name;
    private int duration;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int duration, ArrayList<String> ingredients){
        this.name = name;
        this.duration = duration;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
}
