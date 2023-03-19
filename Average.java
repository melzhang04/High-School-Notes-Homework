
/**
 * Write a description of class Average here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Average
{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    String userInput = "";
    
    do{
    System.out.println("How many grades do you have to enter? ");    
    int grades = input.nextInt();
    double[] nums = new double[grades];   
    getGrades(nums, input);
    average(nums);
    System.out.println("Would you like to run another set of grades? enter y for yes or any other letter for no.");
    userInput = input.next();
    }
    while (userInput.equals("y") || userInput.equals("Y"));

    
    }
    
    public static double[] getGrades(double[] array1, Scanner input){
    for (int i = 0; i<array1.length; i++){
        System.out.println("Enter grade # " + (i) +  " ");
        array1[i] = input.nextDouble();
                      
    }
    return array1;
    }
    
    public static void average(double [] array2){
    double sum= 0;    
    double average = 0;
    for (double x: array2){
        sum = sum + x;
       }
    average = sum/array2.length;    
    System.out.printf("Average = : %.2f\n\n" , average);
    }
    
}
