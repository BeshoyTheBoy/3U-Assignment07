
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner (System.in);
        
        //Ask user for how many people there are
        System.out.println("How many people?");
        
        //Store value in an int variable
        int p = input.nextInt();
        
        //Create array to store heights of dedicated humans
        int[] heights = new int[p];
        
        //Ask user for heights based on how many humans using for loop
        for (int i = 0; i < heights.length; i++){
            System.out.println("Please enter in height (centimeters) number " + (i + 1));
            
            heights[i] = input.nextInt();
        }
        
        //Calculate average height of the group
        //create variable toa store the Total height
        int total = 0;
        
        //go through each number and add them to total variable to get Total number
        for (int i = 0; i < heights.length; i++){
        //add the number into total
        total = total + heights[i];
        }
        
        //Divide the total number by the amount of people
        int averageHeight = total / p;
        
        System.out.println("The above average height(s) is/are:");
        //Go through the array and print the numbers that are above average
        for (int i = 0; i < heights.length; i++){
            //Create if statement to print above average heights
            if (heights[i] > averageHeight){
                
                System.out.println(heights[i] + " cm");
                
            }
        }
        
        
        
    }
}
