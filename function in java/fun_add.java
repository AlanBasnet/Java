import java.util.*;
public class fun_add {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[]args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter any two number:");
        int a = sr.nextInt();
        int b= sr.nextInt();
        int sum = sum(a,b);
        System.out.println("The sum of two number is : "+sum);
        sr.close();
    }
    
}
