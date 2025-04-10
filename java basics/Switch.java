import java.util.*;
public class Switch {
    public static void main (String []args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any number 1 2 or 3");
        int a = sr.nextInt();
        switch(a){
            case 1:{
                System.out.println("Nameste");
                break;
            }
            case 2:{
                System.out.println("Hello");
                break;
            }
            case 3:
            {
                
                System.out.println("Bonjur");
            }
            break;
            default :
            {
            System.out.println("Please choose correct number.");
            }
        }
        sr.close();
    }
}
