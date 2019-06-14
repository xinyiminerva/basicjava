import java.util.*;
//xid220
//Xinyi Deng
//2019 Feb 6 
//cse 02 lab 3 the use of scanner
import org.w3c.dom.ls.LSException;
public class Lab3
{
  public static void main(String[]args)
  {
    System.out.println("1. Circle");
    System.out.println("2 Triangle");
    System.out.println("3. Square");
    System.out.println("4. Rectangle");
    System.out.println("choose from one of these shapes(enter 1,2,3 or 4):");
    Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();
     double pi = 3.14;
     if(i == 1) 
     {
         System.out.println("input radius r ");
          int j = sc.nextInt(); //read radius
          int r = j; 
          double area = pi * r *r;
          System.out.println("The area of circle is " + area);
     }
     if (i == 2)
     {
        System.out.println("input base b  height h ");
         int b = sc.nextInt(); //input base 
         int h = sc.nextInt();//input height
         double area = (b * h ) * 0.5; //calculate area
         System.out.println("The area of Triangle is " + area);
     }
     if(i == 3)
     {
        System.out.println("input a the length of a side");
         int a = sc.nextInt(); //input length of side
         double area = a * a;
         System.out.println("The area of Square is " + area);
     }
     if(i==4)
     {
        System.out.println("input width and height");
         int w= sc.nextInt(); //input width
         int h =  sc.nextInt(); //input height
         double area = w * h;
         System.out.println ("The area of rectangle is " + area);
     }
     else if(( i !=1) &&(i!=2) && (i!=3) &&(i!=4))
     {
         System.out.println("ERROR :" + i + " is not a valid choice. Run the program again");
     }
    }
}