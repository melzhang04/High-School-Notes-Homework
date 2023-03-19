
/**
 * Test Class for objects of the Matrix Operations Class
 *
 * @Kelley
 * @V1
 */
//import Arrays Class

import java.util.Arrays;
public class MartixOpTester
{
    public static void main (String[] args)
    {
        //Create instances that will allow testing of all operations
        MatrixOperations m1= new MatrixOperations(3,5);
        MatrixOperations m2= new MatrixOperations(3,5);
        MatrixOperations m3= new MatrixOperations(5,2);
        MatrixOperations square = new MatrixOperations(2,2);
        
        //assign random values to instance
        //this could also be done in the constructor if you prefer
        m1.assignRandomValues();
        m2.assignRandomValues();
        m3.assignRandomValues();
        square.assignRandomValues();
        
        //print all instances
        m1.printMatrix();
        System.out.println("\n\n");
        m2.printMatrix();
        System.out.println("\n\n");
        m3.printMatrix();
        System.out.println("\n\n");
        square.printMatrix();
        
        //perform addition and store returned array; 
        int[][] sum = m1.matrixAddition(m2);
        System.out.println(/*create a print2DArrayMethod*/);
        
        //perform subtraction and store returned array; 
        int[][] diff = m1.matrixSubtraction(m2);
        System.out.println(/*create a print2DArrayMethod*/);
        
        //perform multiplication and store returned array; 
        int[][] product = m2.matrixSubtraction(m3);
        System.out.println(/*create a print2DArrayMethod*/);
        
        //find the determinant of square 
        int determinant = square.getDeterminant();
        System.out.println("The determinant is: "+ determinant);
        
        //find the inverse of square 
        int[][] inverse = square.getInverse();
        System.out.println(/*create a print2DArrayMethod*/);
    }
}
