
/**
 * Write a description of class ArrayIntro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
import java.util.Arrays;
public class ArrayIntro
{

    public ArrayIntro(){

    }

    public static void main (String []args){
        
        int[] nums = new int[10]; //nums = 0000000000
        int[] notNums = {2,7,8,234,745,1245};
        printArr(nums); //pass array nums into printArr so that it can print
        //num.length = 10 with indices [0,1,2,3,4,5,6,7,8,9]
        printArr(notNums); //pass array notNums into printArr so that it can print
        //nutNums.length = 6 with indices [0,1,2,3,4,5]
        nums[0]=9; //nums 9000000000
        printArr(nums);        
        nums[5]=9; //9000090000
        printArr(nums); 
        //use the arraySum method to add all values of nums 
        System.out.println(numCount(nums, 0));
        System.out.println("The number of 9s in the array is: "+ numCount(nums,9));
    }

    public static void printArr(int[] a){ //passed an array parameter the is names a
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++){ //length is a method to return length of the array
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    public static int arraySum(int[] a){
        int sum =0; //counter to hold the sum
        for (int fred = 0; fred<a.length; fred++){ //loop to run through array
            sum += a[fred];  //this line adds each index to the sum
        }

        return sum; // return sum
    }

    public static void setArr(int[] a){

        for (int i = 0; i < a.length; i++){ //length is a method to return length of the array

            a[i] = i+3;  
        }

    }

    public static int numCount(int [] a, int numSearch){
        int counter = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] == numSearch) // determines if element == searchKey
                counter++; // if so, increase couter
        }
        return counter; //return number of occurrences
    }
}
