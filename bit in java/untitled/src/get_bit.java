/* Get the 3rd bit (position of a
number n.(n=0101)
 */

public class get_bit {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public static void main(String[] args) {

            int n = 5;
            int pos = 2;
            int bitMasks = 1<<pos;

            if((bitMasks & n) == 0) {
                System.out.println("The bit was zero.");
            }
            else{
                System.out.println("The bit was one.");
            }
        }
    }

