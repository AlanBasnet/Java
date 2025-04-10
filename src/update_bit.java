/* Update the 2nd bit position =1) of the
 number n to1.(n =0101)
 */
import java.util.*;
public class update_bit {
    public static void main(String[]args){
        Scanner sr = new Scanner(System.in);

        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        System.out.println("Enter either 0 or 1:");
        int oper = sr.nextInt();
        //int oper = 1; // update bit to 1 else to 0

        // set operation
        if (oper == 1){
            //set
            int newNum = bitMask | n;
            System.out.println(newNum);
        }
        else{
            //
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
