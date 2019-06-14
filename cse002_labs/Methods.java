//xid220
//Xinyi Deng 
//Lab 7 
// March 20 2019
//This program user three merhods 
//use getInt method to get the input 
//use larger method to return the larger number
//use ascending method to return a boolean (true/false)
import java.util.Scanner;
public class Methods{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a,b));
        System.out.println("The larger of " + a + ", "+b+", and " + c + " is " + larger(a,larger(b,c)));
        System.out.println("It is " + ascending(a,b,c) + " that " + a + ", " + b + ", and " + c + " are in ascending order");
    
    } 
    // get the interger if not enter integer rthen prompt the user to enter again 
    public static int getInt( Scanner scan){
        while(!scan.hasNextInt()){
            System.out.println(" You did not enter an int, try again");
            scan.nextLine();
        }
        return scan.nextInt();
    }

    //take in two numbers and return the larger one 
    public static int larger( int num1, int num2)
    {
        if (num1 < num2)
        {
            return num2;
        }else{
            return num1;
        }
    }

    //the method check for whether the number is arrange in ascening order 
    //input three numbers
    public static boolean ascending(int num1, int num2, int num3)
    {
        if((num1 < num2) && (num2 < num3))
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}