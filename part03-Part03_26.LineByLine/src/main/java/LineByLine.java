
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String newstring = scanner.nextLine();
            if (newstring.equals("")){
                break;
            } else {
                String[] words = newstring.split(" ");
                for (int i=0; i<words.length; i++){
                    System.out.println(words[i]);
                }
            }
        }


    }
}
