import java.util.*;
public class strings {
    public static void main(String []args){
        System.out.println("Enter your name.");

        System.out.println("Enter any two strings :");

        Scanner sr =  new Scanner(System.in);
        String a = sr.nextLine();
        System.out.println("Your name is "+a);
        System.out.println("Length of your name is "+a.length());
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));   // to print ever single character
            
        }
        String b = sr.nextLine();
        //         // if a > b : +ve value 
                // if a == b : 0
               // if a<b : -ve value
        if (a.compareTo(b)==0){
            System.out.println("Strings are equal.");

        }
        else{
            System.out.println("The strings are not equal.");
        }
        if(new String ("Alan") != new String ("alan")){
            System.out.println("Alan and alan are not equal");
        }
        sr.close();

        
    }
}
