
/**
 * This class will perform operations on a rectangular Martix
 *
 * @See how much you can do! 
 * @V1
 */
public class MatrixOperations
{
    private int rows;
    private int cols;
    private int[][] matrix;

    public MatrixOperations(int r, int c)
    {
        rows = r;
        cols = c;
        matrix = new int[this.getRows()][this.getCols()];
    }
    public int[][] getMatrix()
    {
        return matrix;
    }
    public int getRows()
    {
        return rows;
    }
    public int getCols()
    {
        return cols;
    }
    public boolean isCompatibleSum(MatrixOperations m1)
    {
        boolean equalRows = this.getRows()==m1.getRows();
        boolean equalCols = this.getCols()==m1.getCols();
        return equalRows && equalCols;
    }

    public boolean isCompatibleDiff(MatrixOperations m1)
    {
        boolean equalRows = this.getRows()==m1.getRows();
        boolean equalCols = this.getCols()==m1.getCols();
        return equalRows && equalCols;
    }

    public boolean isCompatibleProduct(MatrixOperations m1)
    {
        int firstMatrixRows = this.getRows();
        int secondMatrixCols = m1.getCols();
        return firstMatrixRows==secondMatrixCols;
    }

    public void assignRandomValues()
    {
        for (int r = 0; r<this.getMatrix().length; r++)
        {
            for (int c=0; c<this.getMatrix()[r].length; c++)
            {
                this.getMatrix()[r][c] = (int)(Math.random()*21-10);
            }
        }
    }

    public void printMatrix()
    {
        for (int r = 0; r<this.getMatrix().length; r++)
        {
            System.out.print("[");
            for (int c=0; c<this.getMatrix()[r].length; c++)
            {
                System.out.format("%5d", this.getMatrix()[r][c]);
            }
            System.out.println(" ]");
        }
    }   
    /**
     * complete the following methods to perform different operations on Matrices
     * some require a 2nd matrix as a parameter(add, subtract, multiply)
     * others only need to implicit parameter(the unseen @param reference by this) 
     * 
     */
    public int[][] matrixAddition(MatrixOperations m)
    {
        int[][] sum = new int[m.getRows()][m.getCols()];
        int[][] firstMatrix = this.getMatrix();
        int[][] secondMatrix = m.getMatrix();

        //write the code that adds the 2 matrices together(this is commutative)
        //make sure you do not "destroy persistent data"

        return sum;
    }
    public int[][] matrixSubtraction(MatrixOperations m)
    {
        int[][] sum = new int[m.getRows()][m.getCols()];
        int[][] firstMatrix = this.getMatrix();
        int[][] secondMatrix = m.getMatrix();

        //write the code that subtracts the explicit param from the implicts param the 2 matrices together
        //make sure you do not "destroy persistent data"

        return sum;
    }

    public int[][] matrixMultiplication(MatrixOperations m)
    {
        int[][] sum = new int[m.getRows()][m.getCols()];
        int[][] firstMatrix = this.getMatrix();
        int[][] secondMatrix = m.getMatrix();

        //write the code that multiplies the 2 matrices together(matrix mult is not commutative)
        //make sure you do not "destroy persistent data"

        return sum;
    }
    public int getDeterminant()
    {
        int det = 0;
        //make sure the implicit matrix is a square
        if(!(this.getRows()==this.getCols()))
        {
            System.out.println("The Matrix must be a square");
            return det;
        }   
        //write code to find the determinant of a square matrix
        //Your code should at least handle a 2*2 and 3*3 Matrix
        
        
        return det;
    }
    public int[][] getInverse()
    {
        int det = this.getDeterminant();
        int[][] inverse = new int[this.getRows()][this.getCols()];
        //you know what to do!!  :)
        
        return inverse;
    }

}
