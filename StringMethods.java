
/**
 * Write a description of class StringMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMethods
{
    public static void main(String[] args)
    {
        /**
         * We will review the String method from the java quick reference sheet
         * These methods will be very useful and you are required to understand how they work
         */
        String word1 = "Computer";
        String word2 = "Science";
        
        //the .length() method for a String returns an "int" represent the nubmer of characters in the String
        int lengthOfWordOne = word1.length(); //store the length of word1 in a variable
        System.out.println("The length of word1 is: " + lengthOfWordOne); // prints the length of word1
        
        System.out.println("The length of word2 is: " + word2.length()); // prints the length of word2
        
        //the .substring() method has 2 version: 1 int parameter and 2 int parameters
        //version 1: substring(int from, int to) -- this returns a portion of the string [from, to) it doesn't include " to"
        //For example: substring (2,5) will return the chars at 2,3,4 *Not 5*
        //********VERY IMPORTANT*********
        //String are indexed staring at 0!!!!!!!
        
        //You can alwas access the last index of a String by .length()-1.
        
        String phrase1 = "I love Leo";
        String sub1 = phrase1.substring(1,9); //return index 1,2,3,4,5,6,7,8
        System.out.println(sub1); //prints " Love Le";
        
        //****Out of Bounds Errors exist when we reference an index that doesn't exist***
        System.out.println(phrase1.substring(5,phrase1.length()));
        
        //There is an easier to get substring from start to end
        //The 1 parameter substring starts at the given index and substrings to the end.
        System.out.println(phrase1.substring(5)); //return a substring from 5 all the way to the end!!
        
        //indexOf(String s) is an string method that returns the int index of the 1st occurence of a String
        //if the String does not exist, the returned value is -1
        
        String longOne = "Jack is a master chef!";
        //                0123456789
        System.out.println(longOne.indexOf("a"));    //returns 1
        System.out.println(longOne.indexOf("chef")); //returns 17
        System.out.println(longOne.indexOf("fake")); //returns -1 because it doesn't exist
        
        //the .equals method returns a boolean based on whether 2 String contains the same char in the same order (CASE SENSITIVE)
        System.out.println("fred".equals("fred")); //return true
        System.out.println("Fred".equals("fred")); //return false because of case-senstivity
        
        // .eqialsIgnoreCase()
        // System.out.println("Fred".equalsIgnorecase("fred")); //returns true
        
        String s1 = "I Love CompSci";
        String s2 = "I Hate CompSci";
        String s3 = "Jack";
        String s4 = "rain";
                   //       J-> 74      r->114  returns -40
        System.out.println(s3.compareTo(s4)); //this < other
        System.out.println(s1.compareTo(s2));
                   //       L->76       H->72   returns +4
    }
}
