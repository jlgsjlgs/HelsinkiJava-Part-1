
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        
        while (true){
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            
            if (i != 0){
                total++;
            } else {
                break;
            }    
        }
        
        System.out.println("Number of numbers: " + total);
    }
}
