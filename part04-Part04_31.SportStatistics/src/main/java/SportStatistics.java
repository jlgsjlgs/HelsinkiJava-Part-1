
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String teamname = scan.nextLine();
        
        int games=0;
        int wins=0;
        int losses=0;
        
        try (Scanner scanfile = new Scanner(Paths.get(file))){
            while (scanfile.hasNextLine()){
                String row = scanfile.nextLine();
                String[] temp = row.split(",");
                
                if (temp[0].equals(teamname) || temp[1].equals(teamname)){
                    games++;
                    
                    int score1 = Integer.valueOf(temp[2]);
                    int score2 = Integer.valueOf(temp[3]);
                    
                    if (((temp[0].equals(teamname) && (score1>score2))) || ((temp[1].equals(teamname) && (score2>score1)))){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
