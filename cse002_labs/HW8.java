/*
Xinyi Deng
xid220
HW #: 8
   Choose 4 of your favorite TV shows and create a two dimensional array to store names of the shows and 4 character names from each show and then print the TV show name followed by character names.
**/
import java.util.Arrays;

public class HW8 {
    public static void main(String[] args) {
        printArray(createArray());
    } 
    //method to create array
    public static String[][] createArray()
    {
        String[][] multi = { {"The Big Bang Theory", " Sheldon", " Leonard", " Raj", " Howard" },
           {"Modern Family", " Gloria", " Jay", " Claire", " Cam"},
           {"The Resident", " Bell", " Conrad", " Nicolette", " Mina"},
           {"The Good Doctor", " Shaun", " Claire", " Neil", " Jared"}
         };
        return multi;
    }
    //method to print the array
    public static void printArray(String[][] multi)
    {
        int m = multi.length; int n = multi[0].length;
        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++){
            System.out.print(multi[i][j]);
        }
        System.out.println();
    }
    }
}