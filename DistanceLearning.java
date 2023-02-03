/**
 * QUESTION TWO
 * program to evaluate cost of distance learning
 */
import java.util.Scanner;
public class DistanceLearning {  
    public static void main(String args[]) {
        Scanner keypad = new Scanner(System.in);
        while(true){
            try{
                System.out.print("\n Enter Hours: ");//PROMPT FOR HOURS
                int hours = keypad.nextInt();//TAKE THE VALUE FOR HOURS
                if(hours <= 0){break;}//CHECK THAT HOURS IS GREATER THAN 0
                double cost = 0;
                if(hours <= 15){
                    cost += hours * 500;
                }else{
                    cost += hours * 445;
                }
                System.out.print("\n Total cost: " + cost + "\n");//PRINT COST               
            }catch(Exception e){
                break;
            }
        }
    }
}
