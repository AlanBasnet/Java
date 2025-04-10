import java.util.*;
public class max_min {
    public static void main(String[]args){
        int i;
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter an array");
        int n = sr.nextInt();
        int a [] = new int [n];
        System.out.println("Enter the number :");
        for(i=0;i<n;i++){
            a[i]=sr.nextInt();
        }
        System.out.println("The entered number is:");

        for(i=0;i<n;i++){
          System.out.println(a[i]);
        }

        int min = a[0];
        int max = a[0];
        for(i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("The minimum number is "+min);
        System.out.println("The maximun number is "+max);

     sr.close();
    }
}
