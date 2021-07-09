
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int j = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int k = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (i+j+k));
    }
}
