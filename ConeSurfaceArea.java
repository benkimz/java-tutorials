/**
 *
 * @author benkimz
 */
import java.util.Scanner;

public class ConeSurfaceArea {

    /**
     * @param args the command line arguments
     */
    private static double custom_pi = 3.145;
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner userinput = new Scanner(System.in);
        double radius, length, area;
        // REQUEST RADIUS
        radius = userinput.nextDouble();
        // REQUEST LENGTH
        length = userinput.nextDouble();
        // COMPUTE AREA
        area = (custom_pi * radius * radius) + (custom_pi * radius * length);
        // PRINT AREA
        System.out.println(area);
    }
}
