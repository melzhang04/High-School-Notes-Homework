
/**
 * Introduction to String methods
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringPractice
{
    public static void main (String [] args)
    {
        //String literal 
        String lit = "I am a String literal";
        //String object
        String obj = new String("I am a String object");
        
        //literVsObjectTest();
        
        /**
         * the == operator compare the objects location in memory
         * 
         */
        //create 2 identical String "Literals"
        //both variables, a and b, point to the same location in memory
        String a = "Fred";
        String b = "Fred";
        
        //create 2 identical String "Objects"
        //the variables c and b point to the different locations in memory
        String c = new String("Fred");
        String d = new String("Fred");
        String e = c;
        
        //Object and Literal Comparison based on memory location 
        System.out.println(a==b); //true
        System.out.println(a==c); //false
        System.out.println(a==d); //false
        System.out.println(b==c); //false
        System.out.println(b==d); //false
        System.out.println(c==d); //false
        
        
    }

    public static void literVsObjectTest()
    {
        long start1 = System.currentTimeMillis(); 
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            String s1 = "Computer Science";
            String s2 = "Rocks";
        } 
        long end1 = System.currentTimeMillis();
        long total_time = end1 - start1;
        System.out.printf("\nTime taken to execute string literal = %.5f seconds\n", (total_time/1000.0));

        // Initialization time for String
        // object
        long start2 = System.currentTimeMillis();  
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            String s3 = new String("Computer Science");
            String s4 = new String("Rocks");
        } 
        long end2 = System.currentTimeMillis();
        long total_time1 = end2 - start2;
        System.out.printf("\nTime taken to execute string object = %.5f seconds\n", (total_time1/1000.0));
    }
}
