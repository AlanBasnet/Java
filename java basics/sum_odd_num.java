import java.util.*;
public class sum_odd_num {

    public static int sum(int n ){
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                s =s+i;
            }
        }
        return s ;
    }
    public static void main(String[]args){
        System.out.println("Enter any number:");
        Scanner sr = new Scanner (System.in);
        int a = sr.nextInt();
        System.out.println("The sum of odd number up to "+a+" is "+sum(a));
        sr.close();
    }
    
}
