import java.util.Scanner;

@FunctionalInterface
interface Grading{
    abstract String grade(double mark);
}

public class Grader {
    public static void main(String args[]) {
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
        
        Scanner input = new Scanner(System.in);
        System.out.print("\n --- System Online [Ready to Grade] --- ");
        while(true){
            try{
                System.out.print("\n\t Enter mark: ");
                double mark = input.nextDouble();
                System.out.println("\t\t grade: " + grader.grade(mark));
            }catch(Exception e){
                break;
            }
        }
    }
}
