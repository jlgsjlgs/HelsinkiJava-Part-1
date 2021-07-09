
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longest = "default";
        int longestlength = 0, sum=0, count=0;
        
        while (true){
            String newstring = scanner.nextLine();
            
            if (newstring.equals("")){
                break;
            } else {
                count++;
                String[] temp = newstring.split(",");
                
                if (temp[0].length() > longestlength){
                    longest = temp[0];
                    longestlength = temp[0].length();
                }
                sum+= Integer.valueOf(temp[1]);
            }
        }
        
        double average = (double)sum/count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the brith years: " + average);

    }
}
