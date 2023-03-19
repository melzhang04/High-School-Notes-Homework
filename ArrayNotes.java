
/**
 * This is one of the most important and useful sections of this course
 * Arrays store a fixed-size, sequential collection of elements of the same type
 * Arrays can store primitive data(int, double, boolean) types or objects(String, Object)
 *      
 *      -----Array Declaration-------
 *      
 *      dataType[] refVarName = new dataType[numOfElements];
 *      all "buckets" of an array are initialized with the tpye's default value
 *          int --> 0;
 *          double --> 0.0;
 *          boolean --> false;
 *          object --> null
 *          
 *      dataType[] refVarName = {element0, element1, element2, element3};    
 *      all "buckets" of an array are initialized with the given value; 
 *          
 *      int[] nums = new int[10]; //this will create an array that can hold up to 10 ints
 *      int[] nums = {1, 6, 2, 12, 19}; //this will create an array of 5 value 
 *                                    //nums[0] has a value of 1
 *                                    //nums[1] has a value of 6
 *                                    //nums[1] has a value of 2, etc.
 *      
 *      -----Array Assignment-------
 *      
 *      to assign a value to an array, do it the same way as any other assignment.      
 *      the only difference is you must specify the index to assign it to.
 *      arrays are indexed the same way as String --> 0, 1, 2, 3, etc
 *      
 *      nums[0] = 5;  //this will assign the int value 5 to the 0 index. 
 *
 *      -----Accessing element of an index-------
 *      
 *      you can access any element in the array by referencing the varName and the index
 *      System.out.println(nums[0]); //this will access the value stored in the 0 index "bucket"
 *                                   //the number 5 will be printed since we previously assigned 
 *                                   //index 0 the number 5
 *      
 *      -----Using loops with Arrays-------
 *      
 *      a loop can be used to access or assign indices of an array
 *      
 *      --> forLoop 
 *      for(int i = 0; i<nums.length; i++)
 *      {
 *          nums[i] = 2*i;  //this this will assign all "buckets" a value of twice the index     
 *      }
 *      
 *      --> forEachLoop **this type of loop can only be used to access ALL elements of the Array**
 *      for(int x : nums)
 *      {
 *          System.out.println(x);   
 *      }
 *      
 *      -----Common methods used with Arrays-------
 *      import java.util.Arrays;             //allows access the Arrays class methods
 *      Arrays.binarySearch(array, value)    //returns the index of the given value in a SORTED Array (or <0 if not found)
 *      Arrays.copyOf(array, length);        //returns a new copy of the array
 *      Arrays.equals(array1, array2);       //returns true if the 2 arrays contain same elements/same order
 *      Arrays.fill(array, value);           //sets every element of the array to the given value 
 *      Arrays.sort(array);                  //arranges the elements 
 *      Arrays.toString(array);              //returns a String representation of the array --> "[98, 79, 88, 94]"
 *
 * @Kelley
 * @Notes 11-12-2020
 */
import java.util.Arrays;
public class ArrayNotes
{
    public static void main (String[] args)
    {
        int[] grades = {97, 89, 92, 85, 88}; //specifically assigns each index
        int[] randomRolls = new int[5]; //creates an array with 5 "buckets" initialized with defaault 0
        
        randomRolls[0] = (int)(Math.random()*6)+1; //assigns index 0 a random int from 1-6, inclusive
        
        System.out.println(grades[0]); //this will print 97
        System.out.println(grades[3]); //this will print 85
        System.out.println(grades[grades.length-1]); //this will print 88
        System.out.println(grades[3]); //this will print whatever random was assigned
        
        System.out.println(Arrays.toString(grades)); //[97, 89, 92, 85, 88]
        System.out.println(Arrays.toString(randomRolls));//[?, 0, 0, 0, 0]
        
        
        
    }
}
