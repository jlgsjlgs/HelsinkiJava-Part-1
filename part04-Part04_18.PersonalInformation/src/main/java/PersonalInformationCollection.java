
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("First name: ");
            
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()){
                break;
            }
            
            System.out.println("Last name: ");
            String lastname = scanner.nextLine();
            if (lastname.isEmpty()){
                break;
            }
            
            System.out.println("Identification number: ");
            String id = scanner.nextLine();
            if (id.isEmpty()){
                break;
            }
            
            infoCollection.add(new PersonalInformation(firstname, lastname, id));
        }
        
        for (PersonalInformation hold: infoCollection){
            System.out.println(hold.getFirstName() + " " + hold.getLastName());
        }

    }
}
