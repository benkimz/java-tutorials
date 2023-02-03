/**
 *
 * @author benkimz
 */

import java.io.*;

public class BuffredReaderApproach {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //create an instance of the BufferedReader class
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        /*
            STEPS
            ----------------------
            1). initialize a variable 
            2). Prompt the user for a value
            3). assign value to the variable
            4). display the entered value
        */
        
        //Declaration a variable `username`
        String username;
        // displaying a prompt
        System.out.print("Enter a username: ");
        
        //We must catch unexpected IOExceptions when using this approach
        try{
            /*
                We use the instance of the BuffredReader class to take user's 
                input and assign the value to our variable `username`
            */
            username = reader.readLine();
            //Print the `username` on screen in a welcome message
            System.out.println("Welcome, " + username);             
        }catch(IOException error){
            // Incase of an exception
            String errorMessage = error.getMessage();
            System.out.println("Oops! An error occured! Info: "+errorMessage);
        }
        
        //Prompting the user for numbers Example
        /*
            STEPS
            ----------------------
            1). initialize a variable 
            2). Prompt the user for an input
            3). Parse the raw input to be of the desired data-type
            4). assign result to the variable
            5). Do operations
        */
        
        //initialize two integer variables `x` & `y`
        int x, y;
        
        //We must catch unexpected IOExceptions when using this approach
        try{
            /*
                We use the instance of the BuffredReader class to take user's 
                input and assign the value to our variable `username`
            */
            
            //prompt for the value of `x`
            System.out.print("Enter [x]: ");
            x = Integer.parseInt(reader.readLine());
            
            // prompt for the value of `y`
            System.out.print("Enter [y]: ");
            y = Integer.parseInt(reader.readLine());
            
            // take the sum
            
            int sum = x + y;
            //Print the sum of `x` & `y` on screen
            System.out.println("The sum of " + x + " and " + y + " is " + sum);             
        }catch(IOException error){
            // Incase of an exception
            String errorMessage = error.getMessage();
            System.out.println("Oops! An error occured! Info: "+errorMessage);
        }        
        
    }
}
