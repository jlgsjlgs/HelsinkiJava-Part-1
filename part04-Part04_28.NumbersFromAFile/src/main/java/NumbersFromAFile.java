
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int insidebound =0;
        
        try (Scanner scanfile = new Scanner(Paths.get(file))){
            
            while (scanfile.hasNextLine()){
                int temp = Integer.valueOf(scanfile.nextLine());
                
                if (temp >= lowerBound && temp <= upperBound){
                    insidebound++;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + insidebound);

    }

}