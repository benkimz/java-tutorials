/**
 * @author benkimz
 * QUESTION ONE
 * program to calculate income-debt ratio
 */
import java.util.Scanner;

public class IncomeDebtRatio{
    //Variable declaration
    /*
        A customers debt and income information is private to them hence
        we use private variables
        However, we make the variables static so that we can access them within
        the main class without instanciating it.
    */
    
    private static double debt, income;
    
    public static void main(String args[]){
        //Scanner object  for taking users input
        Scanner input = new Scanner(System.in);
        //Welcome message
        System.out.println("--- System Online [Ready to Serve] ---");
        int customers = 20; // declare about 20 customers
        for(short i=1; i<=customers; i++){
            System.out.println("\n\t* [CUSTOMER NUMBER: " + i + "]");
            debt = 0.0;//reset the value for debt for every new costomer to 0.0
            try{
                //Prompt the user to enter value for income
                System.out.print("\n\t Enter Income: ");
                income = input.nextDouble();

                //Request for Mortgages and add value to debt
                System.out.print("\n\t Mortgagues: ");
                debt += input.nextDouble();

                //Request for Automobile Loan value and to debt
                System.out.print("\n\t Automobile Loans: ");
                debt += input.nextDouble();

                //Request for Credit Card Loan and add value to debt
                System.out.print("\n\t Credit Card Loan: ");
                debt += input.nextDouble();

                // Compute ratio
                double ratio = debt / income;
                
                //Print or display the output
                System.out.println("\n\t ---output: " + ratio);
            }catch(Exception error){
                System.out.println("---invalid argument---");
            }
        }        
    }
}
