/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Bird {
    private String englishname;
    private String latinname;
    private int observation;
    
    public Bird(String engname, String latinname){
        this.englishname = engname;
        this.latinname = latinname;
        this.observation = 0;
    }
    
    public void observed(String name){
        this.observation++;
    }
    
    public String getEnglishName(){
        return this.englishname;
    }
    
    public String getLatinName(){
        return this.latinname;
    }
    
    public int getObservation(){
        return this.observation;
    }
}
