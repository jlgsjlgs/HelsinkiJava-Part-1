/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class PaymentCard {
    private Double balance;
    
    public PaymentCard(double bal){
        this.balance = bal;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably(){
        if (this.balance >= 2.60){
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily(){
        if (this.balance >= 4.60){
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double deposit){
        if (deposit > 0){
            if (this.balance + deposit > 150){
                this.balance = 150.0;
            } else {
                this.balance += deposit;
            }
        }
    }
}
