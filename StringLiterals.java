
/**
 * Notes to introduce Naming Conventions, Strings and escape characters.
 *
 * @Coach Kelley
 * @8-6-2021
 * 
 * ****** NOTES ******
 * 
 *    System.out.print and System.out. println display information on the computer monitor.
 *    System.out.println moves the cursor to new line after the information has been displayed, while System.out.print does not.
 *    
 *    --String literals--
 *    
 *    A string literal is enclosed in double quotes.
 *    You can store a String literal as a variable using the keyword String
 *    String word1 = "Computer";
 *    
 *    --Escape sequences--
 *    
 *    Typically anything inside of quotes is considered a character in the String
 *    Escape Sequences allow certain keystrokes to be recognized otherwise
 *    
 *    \t    Inserts a tab in the text at this point (whatever remains of an character block)
 *    \n    Inserts a newline in the test at this point
 *    \'    Inserts a single quote in the test at this point
 *    \"    Inserts a double quote in the test at this point
 *    \\    Inserts a backslash character in the test at this point
 * 
 */
public class StringLiterals
{
    public static void main (String[] args)
    {
        //Create a String variable named gary and assign the word "APCSA"
        String gary = "APCSA";
        //System.out.println(gary);
        
        gary = "is fun";
        //System.out.println(gary);
        
        //System.out.println("\"To be or not to be... \nthat is the question\"");
        /*
        System.out.println("\thydrophobe");
        System.out.println("hyd\trophobe");
        System.out.println("hydro\tphobe");
        System.out.println("hydropho\tbe");
        */
       
        //String concatination..... VERY IMPORTANT!!!!!
        //We can combine String using the +
        
        String word1 = "Alligator";
        String word2 = "Giraffe";
        String word3 = word1 + " " + word2;
        
        System.out.println(word1);
        System.out.println(word2 + " is my favorite animal!");
        System.out.println(word3);
        
    }
    
}
