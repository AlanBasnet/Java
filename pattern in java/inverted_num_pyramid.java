 // Inverted half pyramid with numbers.
/*
1234
123
12
1
 */

public class inverted_num_pyramid {
    public static void main(String[]args){
        int m = 4;   //n=1;
        for(int i=m; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
               
            }
            // n++;
            System.out.println();
        }
    }
}
