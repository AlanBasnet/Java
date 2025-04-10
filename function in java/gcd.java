import java.util.*;
public class gcd {
    public static int fun_gcd(int a , int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any two number:");
        int x=sr.nextInt();
        int y=sr.nextInt();
        System.out.println("The gcd of "+x+ " and "+y+" is "+fun_gcd(x,y));
        sr.close();
    }
    
}
