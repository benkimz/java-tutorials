/*
    * QUESTION SIX
    * Program to calculate the average mark and award a grade.
*/

import java.util.Scanner;
//MY GRADING FunctionalInterface WITH ONE ABSTRACT METHOD grade()
@FunctionalInterface
interface Grading{
    abstract String grade(double mark);
}
public class GradingProgram {
    public static void main(String args[]) {
        //grade() method implementation
        Grading grader = (double mark) -> {
            if(mark >= 70 && mark <= 100){
                return "A";
            }else if(mark >= 60){
                return  "B";
            }else if(mark >= 50){
                return "C";
            }else if(mark >= 40){
                return "D";
            }else if(mark > 0){
                return "FAIL";
            }else{
                return "INVALID";
            }
        };
        //SUBJECTS OF INTEREST
        String subjects[] = {"English", "Maths", "Physics", 
                            "Kiswahili", "Computer", "Geography", 
                            "History", "CRE", "Business", "Agriculture"};
        
        Scanner keypad = new Scanner(System.in);
        double total_mark = 0;
        for(String item: subjects){
            while(true){
                try{
                    System.out.print("\n" + item + ": ");
                    total_mark += keypad.nextDouble(); break;
                }catch(Exception error){
                    System.out.println(error); break;
                }
            }
        }
        System.out.print("\n");
        // PRINT DASHES
        for(int i=0;i<30;i++){System.out.print("-");}
        //PRINT THE TOTAL, AVERAGE and GRADE
        System.out.println("\n Total: " + total_mark + "\n Average: " + 
                (total_mark / subjects.length) + 
                "\n Grade: " + grader.grade((total_mark / subjects.length)));
       
    }
}
