        /*Input a string from the user. Create a new string 
         ‘result’ in which you will replace the letter ‘e’
          in the original string with letter ‘i’. 
         */

import java.util.*;
public class replace_string {
    public static void main(String[]args){
        int i;
        Scanner sr = new Scanner (System.in);
        System.out.println("Enter any string");
        String s = sr.nextLine();
        StringBuilder sb = new StringBuilder (s);
        String result ="";
        sr.close();
        for( i=0;i<s.length();i++){
            if(sb.charAt(i)=='e'){
         result += 'i';
            }
            else{
            result += sb.charAt(i);
            }
            }
            System.out.println(result);
    
        }
    }
    
