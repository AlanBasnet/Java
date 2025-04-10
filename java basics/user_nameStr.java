            /*Input an email from the user. You have to create a
             username from the email by deleting the part that 
              after ‘@’. Display that username to the user.
 */

import java.util.*;
public class user_nameStr {
    public static void main(String[]args){
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter an email :");
        String s = sr.nextLine();
        StringBuilder sb = new StringBuilder (s);
        String username = "";
        sr.close();
        System.out.println("Your email is",sb);
        for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)=='@'){
                break;
            } 
            else{
                username += sb.charAt(i);
            }
        }
    
        System.out.println("Your username is :",username);
    }
    
}
