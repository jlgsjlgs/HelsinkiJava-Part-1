
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulcard = new PaymentCard(20);
        PaymentCard mattcard = new PaymentCard(30);
        
        paulcard.eatHeartily();
        mattcard.eatAffordably();
        System.out.println("Paul: " + paulcard);
        System.out.println("Matt: " + mattcard);
        paulcard.addMoney(20);
        mattcard.eatHeartily();
        System.out.println("Paul: " + paulcard);
        System.out.println("Matt: " + mattcard);
        paulcard.eatAffordably();
        paulcard.eatAffordably();
        mattcard.addMoney(50);
        System.out.println("Paul: " + paulcard);
        System.out.println("Matt: " + mattcard);
        
        

    }
}
