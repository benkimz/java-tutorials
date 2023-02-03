import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test{
    // A SIMPLE RECURSIVE METHOD TO GET THE FACTORIAL OF A NUMBER
    public static int getTheSum(int n){
        int sum = 0;
        if(n > 0) sum += n + getTheSum(n - 1);
        return sum;
    }
    // A SIMPLE RECURSIVE METHOD TO GET THE FACTORIAL OF A NUMBER
    public static long getFactorialN(int n){
        long factorial = 1;
        if(n > 0) factorial *= n * getFactorialN(n - 1);
        return factorial;
    }  
    public static void main(String[] args){
        //System.out output stream writer
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );
        try{
            writer.write("The sum is: " + getTheSum(5) + "\n");
            writer.write("The factorial is: " + getFactorialN(5) + "\n");
            writer.flush();
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}