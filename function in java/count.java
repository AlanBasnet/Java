import java.util.*;
public class count {
        public static void main(String []args){
            int x = 0,y = 0 ,z =0 ,n;
            Scanner sr = new Scanner (System.in);
            do{
               System.out.println("Enter any number:"); 
            
               int a = sr.nextInt();
              
           
        if (a==0){
            x = x+1;
        }
        else if(a>0){
            y=y+1;
        }
        else{
            z=z+1;
        } 
        System.out.println("Press 1 to continue and other kry to");
         n=sr.nextInt();
            }while(n==1);
        sr.close();
        System.out.println("The count of 0 is "+x);
        System.out.println("The count of negative number is "+z);
        System.out.println("The count of positive number is "+y);
        }    
}
