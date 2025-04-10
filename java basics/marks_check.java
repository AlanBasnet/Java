
        /*
 Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
 */

import java.util.*;
public class marks_check {
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        int m;
        do{
             System.out.println("Enter your marks:");
             int n = sr.nextInt();

            if(n>=90){
            System.out.println("This is Good marks.");
            }
            else if(n>=80){
                System.out.println("This is also Good marks.");
            }
            else{
                System.out.println("This is also Good marks.");
                System.out.println("Because marks doesn't matter our effort dose.");
            }

         System.out.println("Enter 1 for continue and 0 to stop");
         m = sr.nextInt();
        } while(m==1);
        sr.close();
    }
    
}

