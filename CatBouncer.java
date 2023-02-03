/**
 *
 * @author benkimz
 */
public class CatBouncer {
    public static void main(String args[]) {
        //USE OF for LOOP
        //The i++ in the for loop parenthesis
        //means i increases by one on every
        //iteration/loop
        for(int i = 0; i < 10; i++){
            System.out.print(">>for loop: The cat will bounce!\n");
        }
        //USE OF while LOOP
        int k=0;
        while(k < 10){
            System.out.print(">> while loop: The cat will bounce!\n");
            k = k + 1;
            //OR YOU CAN JUST DO THIS
            //
            //k++;
            //  OR
            //k+=1;
        }
    }
}
