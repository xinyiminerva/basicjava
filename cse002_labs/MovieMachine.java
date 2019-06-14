/*
login information 
user name : xid220
password: 12345
Name Xinyi deng
Student ID xid220
HW # project 
Explanation of overall purpose of program
Implement a simple movie ticket vending machine.
Input two user interface 
Output
 The movie theater that will use the machine has only one movie and one show time each day.
• Every morning, the theater manager will turn on the ticket machine, and it will ask him for the name of the movie and the ticket price that day.
• It will also ask how many seats are in the theater (so it won't sell too many tickets).
• When a customer walks up to the ticket machine, he will see the name of the movie, the time, and the ticket price displayed.
• The customer will enter number of tickets and enough money to cover the cost of the tickets.
• The machine will give customer change if there is any and print the tickets.
• The machine will print error messages if the customer requests more tickets than available or if the customer does not enter enough money, etc.
• Once all tickets are sold, “SOL OUT” message will be displayed.

*/
import java.util.Scanner;
public class MovieMachine{
    public static void main(String[] arg){
        System.out.println("enter (1)manager (2)customer");
        Scanner scan = new Scanner(System.in);
        String movie = "";
        double price = 0.0;
        int seat = 0;
        int hour = 0;
        int minutes = 0;
        int soldTicket = 0;
        double change = 0.0;
        int u = scan.nextInt();
        if(u == 1) {
            Manager();
           movie = MovieName();
           //call to assign ticket price
          price = ticketPrice();
           //call to assign number of seats
           seat = Seats();
           //call to assign time 
           hour = Hour();
           minutes= Minute();
           }
        if(u == 2) {
            //call the customer method
           Customer(movie, price, seat, hour, minutes);
         
        }
    }
        //the customer metod that take in movie price seat and time
        public static void Customer(String movie, double price, int seat, int hour, int minutes)
        {
            while(movie.length() == 0)
            {
                Manager();
            }
            //diaplay the information after sold ticket
            int soldTicket = Display( movie, price, seat, hour, minutes);
            //calculate the change
            double change = ticketPrice(soldTicket, price);
         TiSoldOut( seat, price, soldTicket);

        }
    
        //diaplay the information of ticket
       public static int Display (String movie, double price, int seat, int hour, int minutes)
       {
           int left ;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of tikets");
        while(true){
        //check invaid input
            if((left =scan.nextInt()) <0)
            System.out.println("please enter a valid input");
            else if((left >seat))
            System.out.println("The ticket numbers you entered is larger than the maximum seat numbers");
            else 
            break;
        }
       System.out.println("Movie title " + movie);
       System.out.println("Movie price " + price);
       System.out.println("Movie time " + hour + " " + minutes);
       return  left;
       }
       //calculate the total price of ticket and make change
       public static double ticketPrice(int TicketNum, double ticketPrice) 
       {
        double price = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the money you paid");
        while(true){
            if((!scan.hasNextDouble())){
            System.out.println("please enter a valid input");
            }
            price = scan.nextDouble();
             if((price< TicketNum * ticketPrice))
            System.out.println("You did not pay enough money");
            else 
            break;
        }
        double change = price - TicketNum * ticketPrice;
        System.out.println("The money you paid " + scan.nextDouble());
        System.out.println("Your change " + change);
         return change;
       }
       //if ticket sold out 
       public static void TiSoldOut(int seat, double price, int soldTicket)
       {
           if ((seat - soldTicket) == 0)
           {
               Manager();
               System.out.println("Number of tickets sold " +  seat);
               System.out.println("Money earned "  + (price * seat));
               System.out.println("How many seats aviable" + (seat - soldTicket ));
           }
           System.out.println("Do you want to change movie setting? enter 1 if you want");
           Scanner scan = new Scanner(System.in);
           if(scan.nextInt() == 1){
            Manager();
           }
       }
    
      //call Manager interface
        public static void Manager()
        {
            Scanner scan = new Scanner(System.in);
            //ask to enter user name
            System.out.println("please enter your user name");
            while(true){
                String name = scan.nextLine();
                String s2 = new String("xid220"); 
                if(!name.equals(s2))
                System.out.println("please enter a valid input");
                else 
                break;
            }
            //ask to enter password
            System.out.println("please enter your password");
            while(true){
                String name = scan.nextLine();
                String s2 = new String("12345"); 
                if(!name.equals(s2))
                System.out.println("please enter a valid input");
                else 
                break;
            }
            //call movie name method
            String movie =MovieName();
            //call to assign ticket price
            double price =ticketPrice();
            //call to assign number of seats
            int seat =Seats();
            //call to assign time 
            int hour =Hour();
            int minutes = Minute();
            Customer(movie, price, seat, hour, minutes);
            if (seat == 999)
           {
            System.out.println("Number of tickets sold " +  seat);
            System.out.println("Money earned "  + (price * seat));
            System.out.println("How many seats aviable" + (seat ));
            System.out.println("Do you want to change movie setting? enter 1 if you want");
           Scanner scan1 = new Scanner(System.in);
           if(scan1.nextInt() == 1){
              Manager();
           }
        }
        }
       //assign movie name
        public static String MovieName()
        {
            String name = "";
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter the name for the movie");
            while(true){
                name = scan.nextLine(); 
                if(name.length() < 1)
                System.out.println("please enter a valid input");
                else 
                break;
            }
             return name;
        }
       //assign ticket price
        public static double ticketPrice()
        {
            double price;
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter the price for the movie");
            while(true){
                if((!scan.hasNextDouble()) ||(price =  scan.nextDouble() )<3)
                System.out.println("please enter a valid input");
                else 
                break;
            }
             return  price;
         }
        //assign number of seats aviable
         public static int Seats()
         {
             int seat;
             Scanner scan = new Scanner(System.in);
             System.out.println("please enter the number of seats");
             while(true){
                 if((!scan.hasNextInt()))
                 System.out.println("please enter a valid input");
                 seat =scan.nextInt();
                 if((seat <50) ||(seat>75))
                 System.out.println("please enter a valid input");
                 else 
                 break;
             }
              return seat;
         }
         //assign hour
         public static int Hour()
         {
             int hour;
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter hour");
            while(true){
                if(((hour =scan.nextInt()) <0) ||(hour>=23))
                System.out.println("please enter a valid input");
                else 
                break;
            }
             return hour;
         }
         //assign minute
         public static int Minute()
         {
             int minu;
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter minutes");
            while(true){
                if(((minu =scan.nextInt()) <0) ||(minu >59))
                System.out.println("please enter a valid input");
                else 
                break;
            }
             return minu;
         }

        
}

        