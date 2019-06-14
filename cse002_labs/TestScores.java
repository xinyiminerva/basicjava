import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;
//xid220
//lab 10
//author Xinyi deng
//This program practice method overload, create 3d array and calculate the average of the array
public class TestScores {
    private static DecimalFormat df2 = new DecimalFormat("#.#");
    public static void main(String[] args) {

        //call printValues method
       printValues(createArray());
        // call get average score method
        getAvgScore(createArray());
    }

    //The create array method to create a 3D array 
    public static double[][][] createArray( ) 
    {
         double[][][] myArray = new double[4][3][2];
         for(int i = 0; i < 4; i++) {
             for(int j = 0; j < 3; j++) {
                 for(int k = 0; k < 2; k++){
                    Integer obj = new Integer(((int)((Math.random()*(100 - 60)+1) + 60)));
                     myArray[i][j][k] = obj.doubleValue();
                 }
                 
             }
         }
         return myArray;
    }
     //the printValues method to print the values in this 3D array 
    public static void printValues(double myArray[][][]) {
        for(int i = 0; i < 4; i++) {
            System.out.println("Student " + (i+1));
            for(int j = 0; j < 3; j++) {
                System.out.print("Test number " + (j+1) + " ");
                for(int k = 0; k < 2; k++){
                System.out.print( (myArray[i][j][k]) + " ");
                }
                System.out.println();
            }
        }
    }

    //get the average score for each student
    public static void getAvgScore(double myArray[][][]) {
        for(int i = 0; i < 4; i++) {
            int sum  = 0;
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 2; k++){
                 sum += myArray[i][j][k];
                }
            }
            sum /= 6;
            System.out.print(" Average for Student " + (i+1) + ": " );
            printValues(sum);
        }
    }
    //the overload version of printvalues
    public static void printValues(int a) 
    {
        System.out.println(a);
    }
}

