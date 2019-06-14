import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
//xid220
//Xinyi Deng
//2019 Feb 6 
//cse 02 lab 4 the use of scanner andswitch statement 
public class Lab4
{
  public static void main(String[]args)
  {
      System.out.println("- Roulette (enter a R or r)");
      System.out.println("- Craps (enter C or c)");
      System.out.println("- Picking a card from a deck of playing cards. (enter a P or p)");
      System.out.println("Choose an option ");
      Scanner sc = new Scanner(System.in);
      String i = sc.nextLine();
      if (i.length()!= 1) //find the length of the string 
      {
          System.out.println("Error");
          System.exit(0);
      }
      switch(i) //using switch statement 
      {
      case "R" ://the case when string is equal to R
     
          System.out.println("Enter the color you want to bet on (red or black):");
          String j = sc.nextLine();
          int ran = 1 + (int)(Math.random() * (36-1)+1);
          if(j.equals("red")) // when the color user guess is red
          {
            System.out.println("Enter the dollar amount that you want to bet: ");
            int t = sc.nextInt();
             if (ran % 2 ==1)
             {
                 t = 2*t;//double the amount
                 System.out.println(" Congratulations: Your random number is " + ran+". You Won " + t);
             }
             else
             {
                 t = 0; //loose the game
                 System.out.println("Sorry : You lose. Your random number is" + ran);
             }
            }
            else if(j.equals("black"))
            {
                System.out.println("Enter the dollar amount that you want to bet: ");
                int t = sc.nextInt();
               if (ran % 2 ==0)
               {
                   t = 2*t;
                   System.out.println(" Congratulations: Your random number is " + ran+". You Won " + t);
               }
               else
               {
                   t = 0;
                   System.out.println("Sorry : You lose. Your random number is" + ran);
               }
            }
          else
          {
              System.out.println("ERROR – invalid color choice – Enter red or black");
          }
            break;
        case "r" :   //using the same logic 
          System.out.println("Enter the color you want to bet on (red or black):");
          String j1 = sc.nextLine();
        
          int ran1 = 1 + (int)(Math.random() * (36-1)+1);
          if(j1.equals("red"))
          {
            System.out.println("Enter the dollar amount that you want to bet: ");
            int t1= sc.nextInt();
             if (ran1 % 2 ==1)
             {
                 t1 = 2*t1;
                System.out.println(" Congratulations: Your random number is " + ran1+". You Won " + t1);
             }
             else
             {
                 t1 = 0;
                 System.out.println("Sorry : You lose. Your random number is" + ran1);
             }
            }
            if(j1.equals("black"))
            {
                System.out.println("Enter the dollar amount that you want to bet: ");
                int t1= sc.nextInt();
               if (ran1% 2 ==0)
               {
                   t1 = 2*t1;
                   System.out.println(" Congratulations: Your random number is " + ran1+". You Won " + t1);
               }
               else
               {
                   t1 = 0;
                   System.out.println("Sorry : You lose. Your random number is" + ran1);
               }
              }
              else
              {
                  System.out.println("ERROR – invalid color choice – Enter red or black");
              }
            break;
            case "C": //not implement yet 
            System.out.println("Not available");
            break;
            case "c ":   //not implement yet
            System.out.println("Not available");
            break;
            case "P":
            System.out.println("Not available");
            break;
            case "p ":
            System.out.println("Not available");
            break;
            default:
            System.out.println("Error, Incorrect input: Choose a valid option");
            System.exit(0);       //exit the program
          }
          }
        }