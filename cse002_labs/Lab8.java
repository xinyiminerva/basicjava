//Name: Xinyi
//Email : xid220
//Lab8
//Writing the methods that are being called in the main method. This method calls three different overloaded versions of the getInt method.
//practice the methods related to arrays
import java.time.chrono.MinguoChronology;
import java.util.Scanner; 
public class Lab8{
    public static void main(String[] args){
        //get the user input using Scanner
        int n = getUserInput();
        int [] array = getUserInput(n);
        //get the lowest
        getMinElement(array);
        //get the highest
        getMaxElement(array);
        //get the sum
        getSum(array);
        int [] array2 = getReverseOrder(array);
        print(array, array2);
    }
    // get the size of the array by prompint user to enter the size of the array 
    public static int getUserInput(){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the size of the array");
     while(!scan.hasNextInt()){
        System.out.println(" You did not enter an int, try again");
        scan.nextLine();
    }
    return scan.nextInt();
    }
   //overload getUserInput method to fill the array with values
    public static int[] getUserInput(int input){
    int[] array = new int[input];
    Scanner value = new Scanner(System.in);
    System.out.println("Enter " + input + " ints ");
    for(int i = 0; i < input; i++) 
    {
      array[i] = value.nextInt();
    }
    value.close();
     return array;
    } 

    //find the max element in the array
    public static void getMaxElement( int[] array){
        int max = array[0];
      for(int i= 0; i < array.length-1; i++)
      { 
          if(array[i] > max)
          {
              max = array[i];
          }
      }
      System.out.println("The highest entry is " + max);
    }

    //find the minimum element in the array
    public static void getMinElement( int[] array){
        int min = array[0];
      for(int i= 0; i < array.length-1; i++)
      {
        if(array[i] < min)
        {
            min = array[i];
        }
      }
     System.out.println("The lowest entry is " + min);
    }

    //get the sum of the array
    public static void getSum( int[] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
       System.out.println("The sum is " + sum);
    }
       
    public static int[] getReverseOrder(int[] array)
    {
        int n = array.length;
        int[] array2 = new int[n];
        for(int i = 0; i < n; i++)
        {
            array2[i] = array[n-1-i];
        }
        return array2;
     }
    
     //print the array elements 
    public static void print(int[] array)
    {
       for(int i = 0; i < array.length; i++)
       {
           System.out.print(array[i]);
       }
    }
   // the overload print method take in two arrays and print the array by columns
    public static void print(int[] array1, int[] array2)
    {
      int n = array1.length;
      for(int i = 0; i < n; i++)
      {
          System.out.println(array1[i] + "    " + array2[i]);
      }
    }
}