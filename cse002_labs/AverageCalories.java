/*
Xinyi Deng
xid220
HW #: 9
  help calculate the average calories eaten per meal in a week for a person whose calorie diary appears below. 
  Your program should have a createArray method to create a mutli-dimensional array and populate it with the following data, 
  a calcAvgCal method to calculate average calories and a printArray method to print the array.
**/
import java.util.Arrays;
import java.text.DecimalFormat;
public class AverageCalories {
    public static void main(String[] args) {
      int [][] contents = createArray();
      int a = calcAvgCal(contents);
      printArray(contents);
      DecimalFormat df = new DecimalFormat("#.0");
      System.out.printf("Average calories per meal " + df.format(a));
    } 
    //create 2d array  and explicit fill in values 
    public static int[][] createArray()
    {
        int[][] contents = new int[][]{{150,800}, {210,600,500},{1500},{150,1500},{300,500,1000,300},{210,1100},{700,500,400}};
        return contents;
    }
    //calculate thre average calories take in the 2d contents array as parameters
    public static int calcAvgCal(int[][]contents)
    {
        int sum = 0;
        for(int i = 0; i < contents.length; i++)
        {
            for(int j = 0;j < contents[i].length; j++)
            {
                sum += contents[i][j];
            }
        }
        return sum/17;
    }
    //method to print array  take in the 2d array to print
     public static void printArray(int[][]contents)
     {
        for(int i = 0; i < contents.length; i++)
        {
            System.out.print("Day " + (i+1) + " ");
            for(int j = 0 ;j < contents[i].length; j++)
            {
                System.out.print(contents[i][j] + " ");
            }
            System.out.println();
        }

     }
    }

    
