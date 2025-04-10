import java.util.Scanner;
public class name_array {
    public static void main(String[]args){
    System.out.println("Enter an array");
    Scanner sr = new Scanner (System.in);
    int n = sr.nextInt();
    System.out.println("Enter any name :");
    String a[] = new String[n];

    for(int i=0;i<n;i++){
      a[i] = sr.next();
    }
    System.out.println("The name you entered are :");
    for(int i=0; i<n;i++)
    {
        System.out.println("Name " + (i+1)+ " is "+a[i]);
    
    }
    sr.close();
    }   
}
