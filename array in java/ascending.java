import java.util.*;
public class ascending {
    public static void main(String[]args){
        int i,j,t;
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter an array");
        int n = sr.nextInt();
        int a [] = new int [n];
        System.out.println("Enter the numbers into an array.");
        for(i=0;i<n;i++){
            a[i]= sr.nextInt();
        }
        System.out.println("The array numbers before assending are :");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("The numbers in ascending order are :");

        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    t = a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sr.close();
    }
    
}
