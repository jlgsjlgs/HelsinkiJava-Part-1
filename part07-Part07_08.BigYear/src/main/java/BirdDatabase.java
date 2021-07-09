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

public class BirdDatabase {
    private ArrayList<Bird> birdlist;
    
    public BirdDatabase(){
        this.birdlist = new ArrayList<>();
    }
    
    public void addBird(Bird bird){
        this.birdlist.add(bird);
    }
    
    public void addObservation(String name){
        int trigger = 0;
        
        for (Bird temp: birdlist){
            if (temp.getEnglishName().equals(name)){
                temp.observed(name);
                trigger++;
                break;
            }
        }
        
        if (trigger == 0){
            System.out.println("Not a bird!");
        }
    }
    
    public void getAllBirds(){
        for (Bird temp: birdlist){
            System.out.println(temp.getEnglishName() + " (" + temp.getLatinName() + ") " + temp.getObservation() + " observations");
        }
    }
    
    public void getOneBird(String name){
        if (this.birdlist.size() == 0){
            System.out.println("No birds in database!");
            return;
        }
        
        int trigger = 0;
        
        for (Bird temp: birdlist){
            if (temp.getEnglishName().equals(name)){
                System.out.println(temp.getEnglishName() + " (" + temp.getLatinName() + ") " + temp.getObservation() + " observations");
                trigger++;
                break;
            }
        }
        
        if (trigger == 0){
            System.out.println("No such bird in database!");
        }
    }
}
