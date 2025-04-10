import java .util.*;
public class prime {
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any number:");
        int n = sr.nextInt();
        int i,c=0;
        sr.close();

        for(i=2;i<n;i++)
        {
            if(n%i==0){
                c=c+1;
            }
        }
        if(c==0){
            System.out.println("The number is prime.");
        }
        else{
            System.out.println("The number is composite.");
        }
    }
}
