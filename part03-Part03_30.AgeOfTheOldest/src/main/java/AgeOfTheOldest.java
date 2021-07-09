
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest=0;
        while (true){
            String newstring = scanner.nextLine();
            
            if (newstring.equals("")){
                break;
            } else {
                String[] age = newstring.split(",");
                int temp = Integer.valueOf(age[1]);
                
                if (oldest < temp){
                    oldest = temp;
                }
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
}
}
