
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = Integer.valueOf(scanner.nextLine());
        
        if (i<0){
            System.out.println(i*(-1));
        } else {
            System.out.println(i);
        }

    }
}
