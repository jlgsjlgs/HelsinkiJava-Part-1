
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Name: ");
            String holder = scanner.nextLine();
            
            if (holder.isEmpty()){
                break;
            } else {
                items.add(new Item(holder));
            }
        }
        
        for (Item hold: items){
            System.out.println(hold);
        }
    }
}
