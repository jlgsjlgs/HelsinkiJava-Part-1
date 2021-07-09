
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics stats = new Statistics();
        Statistics evenstats = new Statistics();
        Statistics oddstats = new Statistics();
        System.out.println("Enter numbers:");
        
        while (true){
            int holder = Integer.valueOf(scanner.nextLine());
            if (holder != -1){
                stats.addNumber(holder);
                if (holder % 2 == 0){
                    evenstats.addNumber(holder);
                } else {
                    oddstats.addNumber(holder);
                }
            } else {
                break;
            }
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenstats.sum());
        System.out.println("Sum of odd numbers: " + oddstats.sum());
    }
}
