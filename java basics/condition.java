import java.util.*;
public class condition {
    public static void main(String args[]){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sr.nextInt();

         if (age >= 18){
            System.out.println("Adult");
         }
         else{
            System.out.println("Child");
         }
        sr.close();
    }

}
