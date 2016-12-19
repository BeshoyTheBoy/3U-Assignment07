
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Create array to store 2 user values
        int A[] = new int[2];

        //ask user for the 2 values
        for (int i = 0; i < A.length; i++) {
            System.out.println("Please enter in number " + (i + 1));

            A[i] = input.nextInt();
        }

        //switch values in order from ascending order

        //create a variable in order to switch the positions
        int difference = 0;

        //if the first number is greater than the second one
        if (A[0] > A[1]) {
            //find the difference between the numbers
            difference = A[0] - A[1];
            //subtract difference from bigger number
            A[0] = A[0] - difference;
            //add difference to smaller number
            A[1] = A[1] + difference;
        }

        System.out.println("The numbers in ascending order are: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
}