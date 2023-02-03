/**
 * QUESTION THREE
 * @author WACHIRA BENARD KIMANI
 */
import java.util.Scanner;
public class BodyMassIndex { 
    public static void main(String args[]) {
        Scanner keypad = new Scanner(System.in);
        double weight, height;//DECLARE NULL VARIABLES
        while(true){
            try{
                System.out.print("\n Enter Weight: "); 
                weight = keypad.nextDouble();//REQUEST WEIGHT
                System.out.print("\n Enter Height: "); 
                height = keypad.nextDouble();//REQUEST HEIGHT
                System.out.print("\n Your BMI is: " + 
                        (weight / (height * height)) + "\n");//GET BMI VVALUE                
            }catch(Exception e){
                break;
            }
            System.out.print("\n BMI VALUES \n");
            //PRINT BMI VALUES IN A FORMATTED FASHION FOR CLARITY
            System.out.print("\n UNDER WEIGHT" + "\t\t\t" + "LESS THAN 18.5");
            System.out.print("\n NORMAL" + "\t\t\t" + "BETWEEN 18.5 AND 24.9");
           System.out.print("\n OVERWEIGHT" + "\t\t\t" + "BETWEEN 25 AND 29.9");
            System.out.print("\n OBESE" + "\t\t\t" + "30 OR GREATER");
            System.out.print("\n\n");
        }
    }
}
