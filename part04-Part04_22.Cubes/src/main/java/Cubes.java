
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String hold = scanner.nextLine();
            
            if (hold.equals("end")){
                break;
            }
            
            int temp = Integer.valueOf(hold);
            System.out.println(temp*temp*temp);
            
        }

    }
}
