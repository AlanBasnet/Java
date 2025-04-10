import java.util.*;
public class fun_multiply {

    public static int mult(int a , int b ){
        // mult = a*b;
        // return mult;
        return a*b;
    }
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any two number :");
        int a = sr.nextInt();
        int b = sr.nextInt();
            //int m = mult(a,b);
        System.out.println("the product of two number is : "+mult(a,b));
        sr.close();
    }
    
    
}
