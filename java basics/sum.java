import java.util.*;
public class sum {
    public static void main(String[]args){

    
    System.out.println("Enter any two number:");
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    int mul = a*b;
    System.out.println("sum is "+sum);
    System.out.println("multiplication  is "+mul);
    sc.close();
    }
}