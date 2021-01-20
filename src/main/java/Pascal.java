/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        // YOUR CODE HERE
        //create 2D array
        int[][] triangle = new int[n][n];

        //set all 2D array values to 0
        for (int[] row: triangle) for (int value: row) value = 0;

        //set top left value to one
        triangle[0][0] = 1;

        //set values of each row based on the value of the previous row
        for (int row = 1; row<triangle.length; row++) {
            triangle[row][0] = 1;
            triangle[row][row-1] = 1;
            for (int column = 1; column<triangle[0].length; column++) triangle[row][column] = triangle[row-1][column-1] + triangle[row-1][column];
        }
    return triangle;
    }
}
