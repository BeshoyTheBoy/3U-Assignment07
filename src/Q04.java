
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create array with 10 positions
        int marks[] = new int[10];

        //Ask user for all marks

        for (int i = 0; i < marks.length; i++) {

            System.out.println("Please enter in mark " + (i + 1));

            marks[i] = input.nextInt();
        }
        //create a variable in order to switch the positions
        int difference = 0;

        //Start sorting array
        //First for loop goes from first position to second last
        for (int x = 0; x < marks.length - 1; x++) {
            //second for loop goes from second position to last position
            for (int y = 0; y < x + 1; y++) {
                //create if statement to compare the numbers
                //if the X position is greater than Y, switch them
                if (marks[x] > marks[y]) {
                    
                }
            }
        }
        
        System.out.println("The marks in ascending order are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
