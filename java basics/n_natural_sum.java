import java.util.*;
public class n_natural_sum {
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        
    System.out.println("Enter the nth term for the sum.");
    int n = sr.nextInt();
    int i,s=0;
    sr.close()  ;

    for(i=1;i<=n;i++){
        s=s+i;
    }
    System.out.println("The sum is " +s);

    }
    
}
