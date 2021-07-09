
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0;
        int nums=0;
        
        while (true){
            System.out.println("Give a number:");
            
            int i = Integer.valueOf(scanner.nextLine());
            
            if (i==0){
                break;
            } else {
                nums++;
                sum+= i;
            }
        }
        System.out.println("Number of numbers: " + nums);
        System.out.println("Sum of the numbers: " + sum);

    }
}
