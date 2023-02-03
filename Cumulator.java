import java.util.Scanner;

public class Cumulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double running_sum = 0, average;
        
        Scanner input = new Scanner(System.in);
        int subjects = 5, i=0;
        while(i < subjects){
            System.out.print("\n Enter mark: "); running_sum += input.nextInt();
            i += 1;
        }
        System.out.print("\n Sum: " + running_sum);
        System.out.print("\n Average: " + (running_sum / subjects));
    }
}
