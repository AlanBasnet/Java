import java.util.*;
public class odd_even {
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any number");
        int n = sr.nextInt();
        if(n%2==0){
            System.out.println("Even number");

        }
        else{
            System.out.println("Odd number");
        }
        
     sr.close()    ;
    }
}
