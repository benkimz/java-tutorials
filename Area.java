import java.util.Scanner;
        
public class Area{
    /*
        * main method with args as parameters
    */
	public static void main(String args[]){
		double length, width, area;
                
		Scanner userinput;
                /*
                    * Input object
                */
                userinput = new Scanner(System.in);
                /*
                    * Request user to enter length of the rectangle
                */
		System.out.print("\n Enter length: "); length = userinput.nextDouble();
                /*
                    * Request user to enter width of the rectangle
                */
                System.out.print("\n Enter width:");width = userinput.nextDouble();
                /*
                    * Compute area
                */
                area = length * width;
                /*
                    * Print area
                */
                System.out.println(area);
                /*
                    * continue ?
                */
                System.exit(0);
                
	}

}