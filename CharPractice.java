
/**
 * Introduction to Characters and casting between char and int
 *
 * @Kelley
 * @Notes - 9/16-17/21
 */
public class CharPractice
{
    public static void main(String[] args)
    {
        /**
         * the primitive data type char 
         */
        char c1 = 'A'; 
        char c2 = 'a';

        System.out.printf("ASCII Character %c as a decimal is %d\n\n", c1, (int)c1);
        System.out.println("ASCII Character " + c2 + " as a decimal is " + (int)c2 + "\n");

        /**
         * when using the operators on "char" the returned value is an int
         * we can change an int to a char by casting
         */
        
        System.out.println("The difference between \'A\' and \'a\' is A - a = " + (c1-c2)); 
        System.out.println("The difference between \'A\' and \'a\' is a - A = " + (c2-c1));
        System.out.println('A' + 32); //char + int returns an int --> 97
        System.out.println((char)('A' + 32)); //when casted to (char) the same expression return 'a'
        
        /*
        System.out.println("\nThe following is a list of the ASCII Characters based on their decimal representation:");
        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 33; i<4608; i++)
        {
        System.out.println("The Character representation of " +  i + " is " +changeToChar(i));  
        }
        */

        
        String word = "You guys are boring today!";
        String wordEncrypted = encrypt(word);
        System.out.println("The word \"" + word + "\" encrypted with our algorithm is : " + wordEncrypted);
        String wordDecrypted = decrypt(wordEncrypted);
        System.out.println("After decryption, the word returns to: " +wordDecrypted);
        
    }

    /**
     * Quick return method to cast an int to a char
     */
    public static char changeToChar(int val)
    {
        return (char)val;   
    }

    /**
     * Simple encrpytrion algorith using charAt() method
     */
    public static String encrypt(String wd)
    {
        String encrypted = "";
        for(int i = 0; i<wd.length(); i++)
        {
            encrypted+=(char)(wd.charAt(i)+5);
        }
        return encrypted;

    }
    
    /**
     * If we are going to encrypt, we must decrypt by reversing the encrpytion
     */
    public static String decrypt(String wd)
    {
        String decrypted = "";
        for(int i = 0; i<wd.length(); i++)
        {
            decrypted+=(char)(wd.charAt(i)-5);
        }
        return decrypted;
    }

}
