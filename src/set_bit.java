/* set the 2nd bit(position=1) of a
number n . (n=0101)
 */

public class set_bit {
    public static void main(String[]args){
        int n = 5;
        int pos = 1;
        int bitMask = 1<< pos;

    int newNum = bitMask | n;
    System.out.println(newNum);
    }
}
