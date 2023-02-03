/**
 *
 * @author benkimz
 */

import java.util.ArrayList;

public class QuestionFour {
    
    public static ArrayList<Float> converter(Float... fahrenheits){
        ArrayList<Float> celcius = new ArrayList<>();
        for(Float f: fahrenheits){
            Float result = (float) ((f - 32) / 1.8);
            celcius.add(result);
        }
        printTable(fahrenheits, celcius);
        return celcius;
    }
    
    public static void printTable(Float[] fahrenheits, ArrayList celcius){
        try{
            assert(fahrenheits.length == celcius.size());
            System.out.println("\n\n\t| *Fahrenheits \t | \t *Celcius \n" + 
                    "\t-----------------------------------");
            for(short i = 0; i < fahrenheits.length; i++){
                Float f = (float) fahrenheits[i];
                Float c = (float) celcius.get(i);
                System.out.println("\t| " + f + " \t\t | \t " + c);
            }
        }catch(Exception e){
            System.out.println("--null output--");
        }
    }
    
    public static void main(String args[]) {
        // convert several temperatures
       ArrayList<Float> conversions = converter(
               40.f,
               37.f,
               76.f
       );
    }
}
