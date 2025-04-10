            // Diamond
/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
 */

public class diamond {
    public static void main(String[]args){
        int i,j,m=4;
        for(i=1;i<=m;i++){
            for(j=i;j<m;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=m;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=m;j++){
                System.out.print("*");
            }
            for(j=i;j<=m-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
