
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int i = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int j = Integer.valueOf(scan.nextLine());
        
        if (i>j){
            System.out.println("Greater number is: " + i);
        } else if (j > i) {
            System.out.println("Greater number is: " + j);
        } else {
            System.out.println("The numbers are equal!");
        } 
        

    }
}
