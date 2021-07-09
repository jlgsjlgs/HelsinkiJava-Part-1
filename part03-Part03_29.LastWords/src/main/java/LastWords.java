
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String newstring = scanner.nextLine();
            
            if (newstring.equals("")){
                break;
            } else {
                String[] word = newstring.split(" ");
                System.out.println(word[word.length-1]);
            }
        }
       
        
        


    }
}
