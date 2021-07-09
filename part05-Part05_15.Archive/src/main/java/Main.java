
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> templist = new ArrayList<>();
        
        while (true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            
            Archive temp = new Archive(identifier, name);
            
            if (templist.contains(temp)){
                continue;
            } else {
                templist.add(temp);
            }
        }
        
        System.out.println("==Items==");
        
        for (Archive holder: templist){
            System.out.println(holder.getIdentifier() + ": " + holder.getName());
        }


    }
}
