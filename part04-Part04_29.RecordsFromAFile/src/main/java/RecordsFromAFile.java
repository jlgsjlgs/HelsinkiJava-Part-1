
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String filename = scanner.nextLine();
        
        try (Scanner scanfile = new Scanner(Paths.get(filename))){
            
            while (scanfile.hasNextLine()){
                String hold = scanfile.nextLine();
                String[] parts = hold.split(",");
                
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
