
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdlist = new BirdDatabase();
        
        while (true){
            System.out.println("? ");
            String userInput = scanner.nextLine();
            
            if (userInput.equals("Quit")){
                break;
            }
            
            switch (userInput){
                case "Add":
                    System.out.println("Name: ");
                    String engname = scanner.nextLine();
                    System.out.println("Name in Latin: ");
                    String latinname = scanner.nextLine();
                    
                    birdlist.addBird(new Bird(engname, latinname));
                    break;
                case "Observation":
                    System.out.println("Bird? ");
                    String tempname1 = scanner.nextLine();
                    birdlist.addObservation(tempname1);
                    break;
                case "All":
                    birdlist.getAllBirds();
                    break;
                case "One":
                    System.out.println("Bird? ");
                    String tempname2 = scanner.nextLine();
                    birdlist.getOneBird(tempname2);
                    break;
            }
        }
    }

}
