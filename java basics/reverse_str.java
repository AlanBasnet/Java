import java.util.*;
public class reverse_str {
    public static void main(String[]args){
    System.out.println("Enter any string");
    Scanner sr = new Scanner (System.in);
    String s =sr.nextLine();
    StringBuilder sb = new StringBuilder (s);
    for(int i=0;i<s.length()/2; i++){
        int front = i ;
        int back = s.length()-1-i;
        char frontChar = s.charAt(front);
        char backChar = s.charAt(back);
        sb.setCharAt(front , backChar);  // to replace character
        sb.setCharAt(back, frontChar);

    }
    System.out.println(sb);
    sr.close();
    }
}
