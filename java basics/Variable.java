import java.util.*;

public class Variable {
    public static void main(String[]args){
    //   float a = 10;
    //   float b= 20;
    //   float s = a+b;
    //   float mul = a*b ;
    //   float div = a/b;
    //   System.out.println(s);
    //   System.out.println(mul);
    //   System.out.println(div);

      // to take input from the user
        System.out.println("Enter your name: ");
        Scanner s = new Scanner(System.in);
        String name =s.nextLine();
        System.out.println("Hello, " + name);
        s.close();
        
        System.out.println("enter your name");
        Scanner s2 = new Scanner(System.in);
        String n = s2.next();
        System.out.println(n);
        s2.close();
    }
}
