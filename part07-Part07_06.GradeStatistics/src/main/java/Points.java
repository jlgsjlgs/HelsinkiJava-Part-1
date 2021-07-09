/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> grades;
    
    public Points(){
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int point){
        this.grades.add(point);
    }
    
    public double getAverageAll(){
        double avg=0;  
        
        for (Integer temp: grades){
            avg+= temp;
        }
        
        return avg/grades.size();
    }
    
    public double getAveragePassing(){
        double avg=0;
        int count=0;
        
        for (Integer temp: grades){
            if (temp >= 50){
                avg+= temp;
                count++;
            }
        }       
        return avg/count;
    }
    
    public double getPassPercentage(){
        double pass =0;
        
        for (Integer temp: grades){
            if (temp >= 50){
                pass++;
            }
        }
        
        return (pass/grades.size())*100;
    }
    
    public void getGrade(String point){
        switch (point){
            case "0":
                for (Integer temp: grades){
                    if (temp < 50){
                        System.out.print("*");
                    }
                }
                break;
            case "1":
                for (Integer temp: grades){
                    if (temp < 60 && temp >= 50){
                        System.out.print("*");
                    }
                }
                break;
            case "2":
                for (Integer temp: grades){
                    if (temp < 70 && temp >= 60){
                        System.out.print("*");
                    }
                }
                break;
            case "3":
                for (Integer temp: grades){
                    if (temp < 80 && temp >= 70){
                        System.out.print("*");
                    }
                }
                break;
            case "4":
                for (Integer temp: grades){
                    if (temp < 90 && temp >= 80){
                        System.out.print("*");
                    }
                }
                break;
            case "5":
                for (Integer temp: grades){
                    if (temp >=90){
                        System.out.print("*");
                    }
                }
                break;    
        }
    }
}
