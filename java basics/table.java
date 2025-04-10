import java.util.*;
public class table {
    public static void main(String[]args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter any number fot its table");    
        int n = sr.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(n+"*"+i+"="+i*n);
        }
    
    sr.close();
    }
}
