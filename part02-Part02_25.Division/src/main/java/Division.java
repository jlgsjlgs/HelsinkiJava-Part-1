import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        Scanner scanner = new Scanner(System.in);
        
        int numerator = Integer.valueOf(scanner.nextLine());
        int denominator = Integer.valueOf(scanner.nextLine());
        division(numerator, denominator);
    }

    // implement the method here
    public static void division(int x, int y){
        double results = (double)x/y;
        
        System.out.println(results);
    }
}
