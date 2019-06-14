import org.w3c.dom.ls.LSException;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;

//xiid220
//xinyi deng 
//lab5
public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Please enter a  number between1 and 1 and 10: ");
            while (!scanner.hasNextInt()) {
                String b = scanner.next();
                System.out.println("Error");
            }
            input = scanner.nextInt();
        } while ((input < 1) || (input > 10));
        System.out.println("Pattern A");
        // loop for first pattern
        for (int numRows = 1; numRows <= input; numRows++) {

            for (int j = 1; j <= numRows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // loop for first pattern
        System.out.println("Pattern B");
        for (int numRows = input; numRows > 0; numRows--) {

            for (int j = 0; j < numRows; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
        // loop for 3 pattern
        System.out.println("Pattern C");
        for (int i = 1; i <= input; i++) {
            for (int k = input; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("" + j);
            }
            System.out.println("");
        }
        // loop for fourth pattern
        System.out.println("Pattern D");
        for (int numRows = input; numRows >= 1; numRows--) {
            for (int y = numRows; y > 0; y--)
                System.out.print(y);
            System.out.println();
        }

    }
}