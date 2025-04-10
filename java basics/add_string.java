        /*Take an array of Strings input from the user & find the
         cumulative (combined) length of all those strings. */
import java.util.*;
public class add_string {
    public static void main (String[]args){
        int t =0;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter number of array:");
        int n =sr.nextInt();
        sr.nextLine();          // conmsume remaining line.
        String name [] = new String [n];
        System.out.println("Enter strings:");
        for(int i=0;i<n;i++){
            name[i]=sr.nextLine();
            t=t+name[i].length();

        }
        System.out.println("Total sum of length of entered string are "+t);
        sr.close();
    }
    
}
