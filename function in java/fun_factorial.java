import java.util.*;
public class fun_factorial {
    

public static int fact(int a){
    int fact = 1;
    if(a<0){
        System.out.println("Invalid number.");
        return 0;
    }

     else if(a==0){
    return 1;
    }
    
    else {
        for(int i =1;i<=a;i++){
         fact = fact *i;

        }
        System.out.println("The factorial of "+a+" is "+fact);
    }
    return fact;
}
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any number:");
        int a = sr.nextInt();
        fact(a);
        sr.close();
    }
}
