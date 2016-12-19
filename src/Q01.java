
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //ask user for how many students there are
        System.out.println("How many students in the class?");

        //create a variable to store the user value to put into array
        int i = input.nextInt();

        //Create array to store marks
        double[] marks = new double[i];

        //ask for all marks based on how many students 
        for (int m = 0; m < marks.length; m++) {
            System.out.println("Please enter mark " + (m + 1));

            marks[m] = input.nextInt();
        }

        //add all the numbers in array using a loop
        double total = 0;
        //go through each number
        for (int b = 0; b < marks.length; b++) {
            //add the number into total
            total = total + marks[b];
        }

        //divide the total by the number of students to get average
        double average = total / marks.length;

        //round answer to 2 decimal places
        average = Math.round(average * 100.0) / 100.0;

        //sout the average to user
        System.out.println("The average mark of the class is " + average + "%");

    }
}
