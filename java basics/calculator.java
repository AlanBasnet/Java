import java.util.*;
public class calculator {
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        /**
        * 1 -> +
        * 2 -> -
        * 3 -> *
        * 4 -> /
        * 5 -> %
        */
        System.out.println("Enter any two number.");
        int x = sr.nextInt();
        int y = sr.nextInt();
        System.out.println("Enter 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for modulus.");
        int a = sr.nextInt();
        switch(a){
            case 1:
            {
                System.out.println(x+y);
                break;
            }
            case 2:
            System.out.println(x-y);
            break;
            case 3:{
                System.out.println(x*y);
                break;
            }
            case 4:{
                if(y==0){
                    System.out.println("Division is not possible");
                }
                else{
                    System.out.println(x/y);
                }
                break;
            }
            case 5:{
                if(y==0){
                    System.out.println("Modulus is not possible");
                }
                else {
                    System.out.println(x%y);
                }
                break;
            }
            default:{
                System.out.println("Choose correct number.");
                break;
            }
        }

       sr.close();

        }
    }

