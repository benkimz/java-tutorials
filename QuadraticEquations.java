/**
 * QUESTION FOUR
 * program to solve quadratic equations
 */
import java.util.Scanner;

@FunctionalInterface
interface RootsFinder{
    abstract void getRoots(double a, double b, double c);
}
// CREATING A CUSTOM TYPE FOR COMPLEX NUMBERS
class Complex{
    public String value(double real, double imaginary, String symb){
        return String.format("%.2f " + symb + " %.2fi", real, imaginary);
    }
    protected String symb;
    Complex(String... args){this.symb = args[0];}
}

public class QuadraticEquations {
    public static void main(String args[]) {
        //CUSTOM TYPE COMPLEX
        Complex complex = new Complex("j");//Complex OBJECT
        
        RootsFinder roots = (double a, double b, double c) -> {
            double discriminant = Math.pow(b, 2) - (4 * a * c);
            
            System.out.print('\n');
            for(int i=0;i<60;i++){System.out.print('-');}//PRINT DAHSES
            if(discriminant == 0){
                //ROOT1 == ROOT2
                System.out.print("\n The roots are real and identical: [" + 
                        (-b / 2 * a) + ", " + (-b / 2 * a) + "]\n\n");
            }else if(discriminant > 0){
                //ROOTS ARE REAL BUT UNIDENTICAL
                System.out.print("\n The roots are real and unidentical: [" + 
                        ((-b + Math.sqrt(discriminant)) / 2 * a) + ", " + ((-b - Math.sqrt(discriminant)) / 2 * a) + "]\n\n");               
            }else{
                //THE ROOTS ARE COMPLEX
                System.out.print("\n The roots are complex: [" + 
                        complex.value((-b / 2 * a), (Math.sqrt(-discriminant) / 2* a), "+") + ", " + 
                        complex.value((-b / 2 * a), (Math.sqrt(-discriminant) / 2* a), "-") + "]\n\n");                 
            }
        };

        Scanner keypad = new Scanner(System.in);
        while(true){
            try{
                double a, b, c;
                System.out.print("\n Enter coefficient a: "); a = keypad.nextDouble();
                System.out.print("\n Enter coefficient b: "); b = keypad.nextDouble();
                System.out.print("\n Enter coefficient c: "); c = keypad.nextDouble();
                roots.getRoots(a, b, c);
            }catch(Exception e){
                break;
            }
        }
    }
}