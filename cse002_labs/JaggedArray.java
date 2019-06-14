/*
Xinyi Deng
xid220
HW #: 9
  Write a program JaggedArray.java to create a jagged two dimensional array of characters with a random number of rows (5 to 10, inclusive) with each row having a random length (5 to 10, inclusive). 
  In each cell of the array, you are to randomly place a letter (drawn from a one-dimensional array of 26 characters, A – Z).
   As the array is populated with a random character, print out the character. Your output should be a jagged two-dimensional array. 
**/
import java.util.Arrays;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        //create row number (random number inclusive from 5-10)
        int rows = ((int)(Math.random() * (10-5)+1) + 5);
        //create a char array
        char[][] myJaggedArray = createArray(rows);
        System.out.println("Printing character being copied from the alphabet array");
        //populate array with random alphabet
        myJaggedArray = populateArray(rows, myJaggedArray);
        System.out.println(" ");
        //print the entire array 
        printArray( myJaggedArray);


    }
    //Create the jagged array inclusive from 5-10
    public static char[][] createArray(int rows) {
        char[][] jaggedArray = new char[rows][];
        for(int i = 0; i < rows; i++) {
            int columns = ((int)(Math.random() * (10-5)+1) + 5);
            jaggedArray[i] = new char[columns];
        }
        return jaggedArray;
    }
    //Fill the array with a random alphabetic value
    public static char[][] populateArray(int rows, char[][] jaggedArray) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; //array of letters
        int alphaIndex;
        for(int i = 0; i < rows; i++) { //assign each cell with a different value
            for(int j = 0; j < jaggedArray[i].length; j++) {
                alphaIndex = (int)(Math.random() * (26));
                jaggedArray[i][j] = alphabet[alphaIndex];
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        return jaggedArray;
    }
    //Print entire array take in number of rows and a char array
    public static void printArray( char[][] jaggedArray) {
        System.out.println("Printing the ragged array");
        for(int i = 0; i < jaggedArray.length; i++) { //assign each cell with a different value
            for(int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}