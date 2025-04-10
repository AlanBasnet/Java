        //Palindromic number pyramid.
/*
    1
   212
  32123
 4321234
 */
public class palindromic_pyramid {
    public static void main(String[]args){
        int i,j,m=5;
        for(i=1;i<m;i++){
            for(j=i;j<m;j++){
                System.out.print(" ");
            }
        for(j=i;j>=1;j--){
            System.out.print(j);
        }
        for(j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
        }
    }
    
}
