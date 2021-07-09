
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest=0;
        String name = "none";
        while (true){
            String newstring = scanner.nextLine();
            
            if (newstring.equals("")){
                break;
            } else {
                String[] temp = newstring.split(",");
                int age = Integer.valueOf(temp[1]);
                
                if (age > oldest){
                    name = temp[0];
                    oldest = Integer.valueOf(temp[1]);
                }
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
