
/*Clear the 3rd bit (position = 2)
 of a number n (n =0101)
 */
public class clear_bit {
    public static void main(String[]args){
        int n =5;
        int pos = 2;
        int bitMask = n<<pos;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}
