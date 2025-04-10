
import java.util.*;
public class average {
    public static int fun_avg(int a ,int b,int c){
        Scanner sr = new Scanner (System.in);
        int avg = (a+b+c)/3;
        sr.close(); 
        return avg;
    }
    public static void main(String[]args){
        System.out.println("Enter any three number:");
        Scanner sr = new Scanner (System.in);
        int a =sr.nextInt();
        int b =sr.nextInt();
        int c =sr.nextInt();
        System.out.println("Thr average of three number is :"+fun_avg(a,b,c));
        
        sr.close(); 
    } 
  
}
