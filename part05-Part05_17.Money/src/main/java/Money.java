
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money temp = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return temp;
    }
    
    public boolean lessThan(Money compared){
        
        if (this.euros > compared.euros){
            return false;
        } else if (this.euros == compared.euros && this.cents > compared.cents){
            return false;
        }
        
        return true;
    }
    
    public Money minus(Money decreaser){
        
        if ((this.euros < decreaser.euros) || (this.euros == decreaser.euros && this.cents < decreaser.cents)){
            Money temp = new Money(0, 0);
            return temp;
        }
        
        if (this.euros >= decreaser.euros && this.cents >= decreaser.cents){
            Money temp = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
            return temp;
        } else {
            
            int hehe1 = this.euros*100 + this.cents;
            int hehe2 = decreaser.euros*100 + decreaser.cents;
            int hehe3 = hehe1 - hehe2;
            
            Money temp = new Money(hehe3/100, hehe3%100);
            return temp;
        }
    }

}
