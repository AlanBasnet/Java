/*Two numbers are entered by the user, x and n.
     Write a function to find the value of one number raised 
    to the power of another i.e. xn. */
    import java.util.*;
    public class power {
        public static void main(String[]args){
            y = 1;
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter the any number x");
            int x = sr.nextInt();
            System.out.println("Enter power to the number.");
            int n = sr.nextInt();
            for(int i=1; i<=n;i++){
                y = y*x;
            }
            System.out.println("The power "+n+ "to the number is "+y);
        sr.close();
        }
        
    }
    