
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0;
        int nums=0;
        
        while (true){
            int i = Integer.valueOf(scanner.nextLine());
            
            if (i>0){
                sum+=i;
                nums++;
            } else if (i==0){
                break;
            }
        }
        
        if (nums == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double)sum/nums;
            System.out.println(avg);
        }
    }
}
