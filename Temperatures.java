/**
 * QUESTION FIVE
 * program to convert temperatures
 */
import java.util.Scanner;

@FunctionalInterface
interface TempConversion{
    abstract void celcius(double f);//MY CONVERSION ABSTRACT METHOD
}
public class Temperatures {
    public static void main(String args[]) {
        Scanner pad = new Scanner(System.in);
        //IMPLEMENTING THE TempConversion ABSTRACT METHOD
        TempConversion converter  = (double f) -> {
            System.out.print("\n " + f + " FahrenHeights ~ " + 
            ((f - 32) / 1.8) + " degrees celcius.");
        };
        while(true){
               try{
                    System.out.print("\n Enter Temp: ");
                    converter.celcius(pad.nextDouble());//CONVERT TEMPERATURE                
               }catch(Exception e){
                   break;
               }
        }
    }
}
