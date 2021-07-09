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

public class UserInterface {
    private Points pointsystem;
    private Scanner scanner;
    
    public UserInterface(Points pointsystem, Scanner scanner){
        this.pointsystem = pointsystem;
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        
        while (true){
            int temp = Integer.valueOf(scanner.nextLine());
            if (temp == -1){
                break;
            }
            
            if (temp >= 0 && temp <= 100){
                pointsystem.addGrade(temp);
            }
        }
        
        System.out.println("Point average (all): " + pointsystem.getAverageAll());
        System.out.println("Point average (passing): " + pointsystem.getAveragePassing());
        System.out.println("Pass percentage: " + pointsystem.getPassPercentage());
        System.out.println("Grade distribution: ");
        
        System.out.print("5: ");
        pointsystem.getGrade("5");
        System.out.println();
        
        System.out.print("4: ");
        pointsystem.getGrade("4");
        System.out.println();
        
        System.out.print("3: ");
        pointsystem.getGrade("3");
        System.out.println();
        
        System.out.print("2: ");
        pointsystem.getGrade("2");
        System.out.println();
        
        System.out.print("1: ");
        pointsystem.getGrade("1");
        System.out.println();
        
        System.out.print("0: ");
        pointsystem.getGrade("0");
        System.out.println();
    }
}
