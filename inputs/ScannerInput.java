/**
 *
 * @author benkimz
 */

import java.util.Scanner;

public class ScannerInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // Create an instance of the Scanner class
        Scanner userinput = new Scanner(System.in);
        /*
            STEPS
            ----------------------
            1). initialize a variable 
            2). Prompt the user for a value
            3). assign value to the variable
            4). display the entered value
        */
        
        //Initializing a variable `username`
        String username;
        
        // displaying a prompt
        System.out.print("Enter a username: ");
        
        /*
            We use the instance of the Scanner class to take user's 
            input and assign the value to our variable `username`
        */
        username = userinput.nextLine();
        
        //Print the `username` on screen in a welcome message
        System.out.println("Welcome, " + username);
        
        /*
            NOTE
            ---------------
            1). You can collapse variable initialization and 
                value assignment into one statement as follows.
        */
        
        // display the prompt
        System.out.print("Enter username 2: ");
        //initialize and assign value
        String username2 = userinput.nextLine();
        //print the value
        System.out.println("Welcome, " + username2);
        
        //Prompting the user for numbers Example
        //variables initialization
        int x, y;
        //prompt the user for `x`
        System.out.print("Enter [x]: ");
        x = userinput.nextInt();
        //prompt the user for `y`
        System.out.print("Enter [y]: ");
        y = userinput.nextInt();
        
        //do some operations if you like
        int sum = x + y;
        int product = x * y;
        //display results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        
    }
}
