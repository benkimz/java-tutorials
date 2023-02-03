/**
 * @author benkimz
 * A GRADING PROGRAM USING THE SWITCH STATEMENT
 * Java Programming
*/

import java.util.Scanner;
import java.time.temporal.ValueRange;

@FunctionalInterface
interface SwitchGrading{
    abstract String grade(int mark);
}

public class SwitchGrader {    
    public static void main(String args[]) {
        
        SwitchGrading grader = (int mark) -> {
            ValueRange gradeA = ValueRange.of(80, 100);
            ValueRange gradeB = ValueRange.of(60, 79);
            ValueRange gradeC = ValueRange.of(40, 59);
            ValueRange gradeD = ValueRange.of(30, 39);
            ValueRange fail = ValueRange.of(0, 29);
            switch(
                    (gradeA.isValidValue(mark)) ? "A" : 
                    (gradeB.isValidValue(mark)) ? "B" : 
                    (gradeC.isValidValue(mark)) ? "C" : 
                    (gradeD.isValidValue(mark)) ? "D" : 
                    (fail.isValidValue(mark)) ? "F" : "INVALID"
                    ){
                case "A":
                    return "A";
                case "B":
                    return "B";
                case "C":
                    return "C";
                case "D":
                    return "D";
                case "F":
                    return "FAIL";
                default:
                    return "INVALID";
            }            
        };
        
        Scanner input = new Scanner(System.in);
        System.out.print("\n --- System Online [Ready to Grade] --- ");
        while(true){
            try{
                System.out.print("\n\t Enter mark: ");
                int mark = input.nextInt();
                System.out.println("\t\t grade: " + grader.grade(mark));
            }catch(Exception e){
                break;
            }
        }
    }    
}