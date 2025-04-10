import java.util.*;
public class function {               // function decleration
    public static void printName(String name ){
        System.out.println(name);
        return ;
    }
    public static void main(String[]args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name =sr.nextLine();

        printName("My name is "+name);    // function call
     sr.close();
   }     
}
