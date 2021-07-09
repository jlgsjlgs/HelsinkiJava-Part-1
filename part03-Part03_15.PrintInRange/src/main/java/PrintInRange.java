
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i=0;i<11;i++){
            numbers.add(i);
        }
        
        System.out.println("The numbers in the range [3,5]");
        printNumbersInRange(numbers, 3, 5);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        
        for (Integer x: numbers){
            if (x>= lowerLimit && x<=upperLimit){
                System.out.println(x);
            }
        }
    }
}
