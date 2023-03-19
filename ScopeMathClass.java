
/**
 * In this lesson, we will tie up some loose ends with Variable Scope and the Math class
 * 
 *
 * @Kelley
 * @8-18-2021
 */

public class ScopeMathClass
{ //open brace for class
    static int globalVariable = 123;
    //scope is the range over which a variable is recognized and can be used
    //scope of a variables will always follow the braces unless it is passed as a parameter
    public static void main (String[] args)
    { //open brace for main method
    /*
        int mainVariable = 21;
        System.out.println(globalVariable);
        methodTwo();
        methodOne(mainVariable);
    */
        System.out.println(Math.abs(-9.5));
        System.out.println(Math.pow(2, 6)); //it accepts 2 parameters (base, exponent);
        System.out.println("The squareroot of 81 is " + Math.sqrt(81)); 
        
        //Math.random() returns a random double between [0,1) 0 <--> .99999999999
        for (int i = 0; i< 100; i++)
        {
        System.out.println((int)(Math.random()* 6 + 1)); // return a random double between [0, 7)
    }
    } //close brace for main method
    public static void methodOne(int x)
    { //open for methodOne
        System.out.print(x);
        int methodOneVariable = 55;
    } //close for methodOne
    public static void methodTwo()
    { //open for methodTwo
        int methodTwoVariable = 12;
        System.out.println(globalVariable*2);
    } //close for methodTwo
} // close brace for my class




