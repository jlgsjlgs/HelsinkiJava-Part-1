
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int j = Integer.valueOf(scanner.nextLine());
        System.out.println(i + " + " + j + " = " + (i+j));

    }
}
