import java.util.*;
public class fibonacci {
    
    public static void febo(int n){
      int a=0,b=1,c ;
       System.out.print(+a+" "+b+" ");
       for(int i=2;i<n;i++){
       c = a+b;
       System.out.print(c+" ");
       a=b;
       b=c;   

       }
    System.out.println();
    }
    public static void main(String[]args){
        System.out.println("enter any number:");
        Scanner sr = new Scanner(System.in);
        int x = sr.nextInt();
        System.out.println("The febonacci series is:");
       
          febo(x);  
        
        sr.close();
    }
}
