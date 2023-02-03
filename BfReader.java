/**
 *
 * @author benkimz
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BfReader {
    public static void main(String args[]) {
        int users = 20;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        do{
            users--;
            int hours = 0;
            try{
                hours = Integer.parseInt(reader.readLine());
                //handleInput(hours);
            }catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
            //END OF FILE EXCEPTION HAS REACHED UNEXPECTEDLY [EOFException]
            
            /** Signals that an I/O exception of some sort has occurred. 
                * This class is the general class of exceptions produced by 
                * failed or interrupted I/O operations [IOException]
            */
            
            // Signals that an attempt to open the file denoted by a 
            // specified pathname has failed.[FileNotFoundException]
            
            // Signals that an I/O operation has been interrupted 
            // [InterruptedIOException]
            
            //DO ANYTHING HERE WITH hours
            System.out.print("Entered hours: " + hours);
        }while(users > 0);
    }
}
