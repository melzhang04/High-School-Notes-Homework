
/**
 * Notes and examples for Primitive Data Types.
 *
 * @Coach Kelley
 * @8-6-2-21
 * 
 * ****** NOTES ******
 *   A data type is a set of values and operation that can be performed on them
 *   Data types in java can be categorized as either primitive or reference
 *   
 *   The primitive data types used in this course are int, double, and boolean
 *   Other primitive data types inlcude: byte, short, long, float, and char
 * 
 *   Each Variable has associated data that is used to hold its value
 *   The memory associated with a primitive type holds an actual value
 *   When a variable is declared final, its value can not be changed once is is initialized
 *   
 *   Arithmetic expressions include expressions of type int and double
 *   The arithmetic operators include +, -, *, /, %
 *   Any arithmetic operation that uses 2 int values will evaluate to an int (be careful with this and division)
 *   Any arithmetic operation that uses 1 or more doubles will evaluate to a double
 *   Division by 0 will result in an ArithmeticException
 *   
 *   The assignment operator allows a program to initialize or change the value stored in a variable
 *   During execution, expressions are evaluated using order of precendence
 *   The "value of an expression" has a type base on the evaluation of the expression
 *   
 *   Compound assignment operators (+=, −=, *=,/=, %=) can be used in place of the assignment operator.
 *   num1 += 3 --> num1 = num1 + 3  and val /= 10 --> val = val / 10
 *   The increment operator (++) and decrement operator (−−) are used to add 1 or subtract 1 from the stored value of a variable
 *   
 *   The casting operators (int) and (double) can be used to create a temporary value converted to a different data type.
 *   Casting a double value to an int causes the digits to the right of the decimal point to be truncated.
 *   
 *   Values of type double can be rounded to the nearest integer by (int)(x + 0.5) or (int)(x – 0.5) for negative numbers.
 *   
 *   If an expression would evaluate to an int value outside of the allowed range, an integer  overflow occurs. 
 *   This could result in an incorrect value within the allowed range.
 *   
 */

public class PrimitiveDataTypes
{
    public static void main (String[] args)
    {
       int numOne = 1;
       int numTwo = 3;
       
       double dOne = 9.9;
       double dTwo = -7.5;
       double dThree = 4;
       
       System.out.println("numOne + numTwo = " + (numOne + numTwo));
       System.out.println("The Value of dOne is: " + dOne);
       System.out.println((int)dTwo);
       System.out.println(dThree);
       
       System.out.println((double)numOne/numTwo);
       
       /*
       boolean melisaIsReallyCool = true;
       
       System.out.println("Melisa is really cool = " + melisaIsReallyCool);
       
       boolean barnabasIsABully = true;
       
       System.out.println("barnabas is a bully = " + barnabasIsABully);
       
       boolean barnabasIsBadAtMake24 = true;
       
       System.out.println("barnabas is bad at make24 = " + barnabasIsBadAtMake24);
       */
    
      String wordOne= "Addition is cool";
      System.out.println(5+2 + wordOne); //7Addition is cool
      System.out.println(wordOne + 5*2); //Addition is cool10
      System.out.println(wordOne + (5+2)); //Adition is cool7
      
      //The min and max int are represented
      //Integer.MAX_VALUE = 2,147,483,647
      System.out.println("The Maximum integer value is: " + Integer.MAX_VALUE);
      //Integer.MIN_VALUE = -2,147,483,648
      System.out.println("The Minimum integer value is: " + Integer.MIN_VALUE);
      
      System.out.println(Integer.MAX_VALUE + 1);
      System.out.println(Integer.MIN_VALUE - 1);
      
     System.out.println("W");

System.out.println("X");

System.out.print("Y");

System.out.print("Z");

    
    }
}
