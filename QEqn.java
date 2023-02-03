/**
 *
 * @author benkimz
 */

import java.util.Scanner;

class ComplexNumber{
    public String type = "complex number";
    private String value;
    ComplexNumber(float real, float imaginary, String sign){
        this.value = String.format("%.2f " + sign + " %.2f i", real, imaginary);
    }
    public String toString(){
        return this.value;
    }
}

public class QEqn {
    public static void main(String args[]) {
        // TODO code application logic here
        ComplexNumber num = new ComplexNumber(2.5f, 3.0f, "+");
        System.out.print(num);
        
    }
}
