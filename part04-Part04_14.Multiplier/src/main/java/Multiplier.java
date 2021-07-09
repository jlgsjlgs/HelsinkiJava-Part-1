/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class Multiplier {
    private int multiple;
    
    public Multiplier(int Multiple){
        this.multiple = Multiple;
    }
    
    public int multiply(int number){
        return this.multiple * number;
    }
}
