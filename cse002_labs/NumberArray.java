/*
    Xinyi Deng
    Student ID: xid220
    Hw #: 7
    NumberArray: Creates array of random values and calculates metrics
 */

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] myArray = new int[15];

        for(int i = 0; i < 15; i++) {
            myArray[i] = ((int)(Math.random() * 100-0) + 1);
        }

        int total = 0;
        for(int j = 0; j < 15; j++) {
            total = total + myArray[j];
        }
        int average = total/15;
        System.out.println("Average of all numbers " + average);

        int countGreater = 0;
        int countLower = 0;

        for (int k = 0; k < 15; k++) {
            int currVal = myArray[k];
            if(currVal > average) {
                countGreater++;
            }
            if(currVal < average) {
                countLower++;
            }
        }

        System.out.println( countGreater + " numbers greater than the average ");
        System.out.println( countLower + " numbers lower than the average.");
        int[] oddNumbers = oddNumArray(myArray);
        int[] evenNumbers = evenNumArray(myArray);
        System.out.print("All number array: ");
        System.out.println(Arrays.toString(myArray));
        System.out.print("Odd number array " );
        System.out.println(Arrays.toString(oddNumbers));
        System.out.print("Even number array ");
        System.out.println(Arrays.toString(evenNumbers));



    }

    public static int[] oddNumArray(int[] values) {
        int counter = 0;
        for(int i = 0; i < 15; i++) {
            int currVal = values[i];
            if(currVal % 2 != 0) {
                counter++;
            }
        }

        int[] oddNums = new int[counter];
        int k = 0;
        for(int j = 0; j < 15; j++) {
            int currVal = values[j];
            if(currVal % 2 != 0) {
                oddNums[k] = currVal;
                k++;
            }
        }
        return oddNums;
    }

    public static int[] evenNumArray(int[] values) {
        int counter = 0;
        for(int i = 0; i < 15; i++) {
            int currVal = values[i];
            if(currVal % 2 == 0) {
                counter++;
            }
        }

        int[] evenNums = new int[counter];
        int f = 0;
        for(int i = 0; i < 15; i++) {
            int currVal = values[i];
            if(currVal % 2 == 0) {
                evenNums[f] = currVal;
                f++;
            }
        }
        return evenNums;
    }
}