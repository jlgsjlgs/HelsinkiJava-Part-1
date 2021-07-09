
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int trigger=0;
        
        try (Scanner scanfile = new Scanner(Paths.get(file))){
            
            while (scanfile.hasNextLine()){
                String row = scanfile.nextLine();
                
                if (row.equals(searchedFor)){
                    trigger++;
                    break;
                }
            }
            
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }  
        
        if (trigger == 0){
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }

    }
}
