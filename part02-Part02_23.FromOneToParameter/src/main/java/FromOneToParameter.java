import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i = Integer.valueOf(scanner.nextLine());
        printUntilNumber(i);
    }
    
    public static void printUntilNumber(int num) {
        
        for (int i=1; i<=num; i++){
            System.out.println(i);
        }
    }

}
