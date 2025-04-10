import java.util.*;
public class fun_greatest {
    public static int greatest(int a, int b){
       if(a==b){
        System.out.println("Both the numnber are equal.");
        return 0;
       }
       if(a>b){
        
            return a;
        }
        else{
       
            return b;
        }
    }
        public static void main (String[]args)   {
            System.out.println("Enter any two number:");
             Scanner sr  = new Scanner (System.in);
            int a = sr.nextInt();
            int b = sr.nextInt();
            System.out.println("The greatest among two number is "+greatest(a,b));
        sr.close();
        }
   
}
