import java.util.*;
public class greater {
    public static void main (String[]args)   {
        Scanner sr  = new Scanner (System.in);
        System.out.println("Enter any two number");
        int a = sr.nextInt();
        int b = sr.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println(a+ "is greater then "+b);
        }
        else{
            System.out.println(b+ " is greater then "+a);
        }
        sr.close();
    }
}
