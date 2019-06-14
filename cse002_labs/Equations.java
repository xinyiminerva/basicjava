/*
    Xinyi Deng
    Student ID: xid220
    Hw #: 7
   Equations.java that calls a method that solves the equation z = x2+2xy+y2 to find the value of z where the user inputs the values of x and y. 
 */

import java.util.Arrays;
import java.lang.Math; 
import java.util.Scanner;
public class Equations {
    public static void main(String[] args) {
        int x, y, n;
        Scanner scan = new Scanner(System.in);
            //check input is integer
            System.out.println("Enter value for x : ");
            while(!scan.hasNextInt()) {
                System.out.println("invalid");
                scan.next();
            }
            x = scan.nextInt();
              //check input is integer
              System.out.println("Enter value for y : ");
            while(!scan.hasNextInt()) {
                System.out.println("invalid");
                scan.next();
            }
             y = scan.nextInt();
        System.out.println(" The result of equation to the power " + x + " is " + calculate(x,y));
          //check input is integer
          System.out.println("Enter value for n: ");
        while(!scan.hasNextInt()) {
            System.out.println("invalid");
            scan.next();
        }
         n = scan.nextInt();
        System.out.println(" The result of equation to the power " + n + " is " + calculate(x,y,n));
    }
    //calculate base on first equation
    public static int calculate (int x, int y)
    {
      int z = x*x + 2 * x * y + y * y;
      return z;
    }
    //calculate base on second equation 
    public static int calculate (int x, int y,int n)
    {
      int z = (int)Math.pow(x,n) + 2 * x * y + (int)Math.pow(y,n);
      return z;
    }
}