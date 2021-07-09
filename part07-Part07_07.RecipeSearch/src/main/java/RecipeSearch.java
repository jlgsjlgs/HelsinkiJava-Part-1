
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        RecipeBook recipebook = new RecipeBook();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(recipebook, scanner);
        ui.start();
    }

}
