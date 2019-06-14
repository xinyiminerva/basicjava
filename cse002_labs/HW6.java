//Name: Xinyi
//Email : xid220
//HW6
//Writing the methods that are being called in the main method. This method calls three different overloaded versions of the getInt method.
import java.util.Scanner; 
public class HW6{
    public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int n;
    n=getInt(scan); //call getInt
    System.out.println("You entered "+n);
    n=getInt(scan,6,true); //call overload version of getInt
    System.out.println("You entered "+n);
    n=getInt(scan,15,false);
    System.out.println("You entered "+n);
    n=getInt(scan,12,18);
    System.out.println("You entered "+n);
    n=getInt(scan,22,18); //call overload version of getInt
    System.out.println("You entered "+n);
    } 
//getInt method for all the integer input by Scanner class
     public static int getInt(Scanner scan) {
        int returnVal = 0;
        System.out.print("Enter an int: ");
            while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                System.out.print("You must enter an int ");
                scan.next();
            }
            //user entered an integer 
        returnVal = scan.nextInt();
        //return value
        return returnVal;
    }
//getInt greater than or lower than a bound ,boolean true when we want greater than false if we want lower than
//input by Scanner class, a bound to check and boolean determine lower and greater 
    public static int getInt(Scanner scan, int bound, boolean isGreaterThan) {
        int returnVal = 0;
        if (isGreaterThan) {//when true
            do{
                System.out.println("Enter an int greater than or equal to " + bound + ": ");
                while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                    System.out.println("You must enter an int ");
                    scan.next();
                }
                returnVal = scan.nextInt();
               //when scan less  than bound, prompt user to enter again
                while (returnVal < bound){
                    System.out.println("You did not enter an int greater than or equal to " + bound);
                   // scan.next();
                    while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                        System.out.println("You must enter an int ");
                        scan.next();
                    }
                    returnVal = scan.nextInt();
                  }
        } while (returnVal < bound);
    }
        else if (!isGreaterThan) { //not greater than 
            do{
            System.out.println("Enter an int less than or equal to " + bound + ": ");
                while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                    System.out.println("You must enter an int ");
                    scan.next();
                }
                returnVal = scan.nextInt();
               //when scan less  than bound, prompt user to enter again
                while (returnVal  > bound){
                    System.out.println("You did not enter an int less than or equal to " + bound);
                   // scan.next();
                    while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                        System.out.println("You must enter an int ");
                        scan.next();
                    }
                    returnVal = scan.nextInt();
                }
            }while (returnVal > bound);
        }
        return returnVal;
    }

//getInt method for integer between bound1 and bound two conditions to consider
//input user entered value by Scanner, have two bounds to check, bound1 and bound2
    public static int getInt(Scanner scan, int bound1, int bound2) {
        int returnVal = 0;
        if (bound1 > bound2) {
            do {
                System.out.print("Enter an int between " + bound2 + " and " + bound1 + ", inclusive: ");
                while (!scan.hasNextInt()) {
                    System.out.println("You must enter an int ");
                    scan.next();
                }
                returnVal = scan.nextInt();
                while (returnVal >= bound1 || returnVal <= bound2){
                    System.out.println("You did not enter an int in [ " + bound2+ " , " + bound1 + " ]");
                   // scan.next();
                    while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                        System.out.println("You must enter an int ");
                        scan.next();
                    }
                    returnVal = scan.nextInt();
                }
            } while (returnVal >= bound1 || returnVal <= bound2); //make sure returned value in bounds 
        } else if (bound2 > bound1) {
            do {
                System.out.print("Enter an int between " + bound1 + " and " + bound2 + ", inclusive: ");
                while (!scan.hasNextInt()) {
                    System.out.println("You must enter an int");
                    scan.next();
                }
                returnVal = scan.nextInt();
                while (returnVal <= bound1 || returnVal >= bound2){
                    System.out.println("You did not enter an int in [ " + bound1+ " , " + bound2 + " ]");
                   // scan.next();
                    while (!scan.hasNextInt()) { //when user not enter integer prompt the user to enter again
                        System.out.println("You must enter an int ");
                        scan.next();
                    }
                    returnVal = scan.nextInt();
                }
            } while (returnVal <= bound1 || returnVal >= bound2); //make sure returned value in bound 
        }
        return returnVal;
    }
}
