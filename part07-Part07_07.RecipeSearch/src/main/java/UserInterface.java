/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    private RecipeBook recipebook;
    private Scanner scanner;
    
    public UserInterface(RecipeBook recipebook, Scanner scanner){
        this.recipebook = recipebook;
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("File to read: ");
        String filename = scanner.nextLine();
        
        try (Scanner filescan = new Scanner(Paths.get(filename))){
            ArrayList<String> fileLines = new ArrayList<>();
            
            while (filescan.hasNextLine()){
                String line = filescan.nextLine();
                
                if (line.isEmpty() || !filescan.hasNextLine()){
                    String recipename = fileLines.get(0);
                    int recipetime = Integer.valueOf(fileLines.get(1));
                    ArrayList<String> ingredientlist = new ArrayList<>();
                    
                    for (int i=2; i<fileLines.size(); i++){
                        ingredientlist.add(fileLines.get(i));
                    }
                    
                    this.recipebook.addRecipe(new Recipe(recipename, recipetime, ingredientlist));
                    fileLines.clear();
                } else {
                    fileLines.add(line);
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        printCommands();
        while (true){
            String userInput = scanner.nextLine();
            
            if (userInput.equals("stop")){
                break;
            }
            
            switch (userInput){
                case "list":
                    System.out.println("Recipes: ");
                    this.recipebook.getRecipeList();
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    String searchedword = scanner.nextLine();
                    this.recipebook.getSimilarRecipeNames(searchedword);
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    int maxtime = Integer.valueOf(scanner.nextLine());
                    this.recipebook.getRecipesBelowTime(maxtime);
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    this.recipebook.getRecipesContainingIngredient(ingredient);
                    break;
            }
        }
    }
    
    public static void printCommands(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
}
