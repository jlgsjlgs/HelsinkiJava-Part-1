import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(input);
    }
    
    public static void printFromNumberToOne(int num){
        
        for (int i = num; i>=1; i--){
            System.out.println(i);
        }
            
    }

}
