/*
Xinyi Deng
xid220
Lab #: 9
   TestMatrix.java with a main method that calls three methods, createMatrix() , printMatrix() and addMatrixNum(). The createMatrix() method creates a two-dimensional integer array of size 3 by 3 and randomly populates it with any of the integers from 1 to 9
 */

import java.util.Arrays;

public class TestMatrix {
    public static void main(String[] args) {
        int[][] m1 = createMatrix(3,3);
        int[][] m2 = createMatrix(3,3);
        System.out.println("Starting matrices");
        printMatrix(m1);
        printMatrix(m2);
        int[][] summedMatrix = addMatrixNum(m1,m2);
        System.out.println("End matrix");
        printMatrix(summedMatrix);
    }
    //prints out a matrix using a for loop
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
    //creates a matrix of specified size and fills it with random integers
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                matrix[i][j] = ((int)(Math.random() * (9-1)+1) + 1);
            }
        }
        return matrix;
    }
    //uses matrix addition to sum the two matricies
    public static int[][] addMatrixNum(int[][] m1, int[][] m2) {
        int[][] summed = new int[3][3];
        for(int i = 0; i < summed.length; i++) {
            for(int j = 0; j< summed[i].length; j++) {
                summed[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return summed;
    }
}