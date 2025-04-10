import java.util.*;
public class array {
    public static void main(String[]args){
    int a[] = new int[15];
    System.out.println("Enter an array");
    Scanner sr = new Scanner (System.in);
    int n = sr.nextInt();
    System.out.println("Enter any number :");

    for(int i=0;i<n;i++){
      a[i] = sr.nextInt();
    }
    System.out.println("The number you entered are :");
    for(int i=0; i<n;i++)
    {
        System.out.println(a[i]);
    }
    System.out.println("Enter the number to be searched");
    int w = sr.nextInt();
    for(int i=0;i<n;i++){
        if(w==a[i]){
            System.out.println("The number is in "+(i+1)+" position.");  
        }
        else{
            System.out.println("Your entered number is not found.");
        }
    }
    sr.close();
    }   
}
