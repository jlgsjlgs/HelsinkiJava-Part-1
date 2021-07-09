
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> stringlist = new ArrayList<>();
        stringlist.add("First");
        stringlist.add("Second");
        stringlist.add("Third");
        removeLast(stringlist);
    }
    
    public static void removeLast(ArrayList<String> strings){
        
        if (strings.size() == 0){
            return;
        } else {
            strings.remove(strings.size() - 1);
        }
    }

}
