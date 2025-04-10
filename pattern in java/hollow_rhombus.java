        // Hollow rhombus.
/*
    *****
   *   *
  *   *
 *   *
*****
 */

public class hollow_rhombus {
    public static void main (String[]args)    {
        int i,j,m=5;
        for(i=1;i<=m;i++){
            for(j=i;j<m;j++){
                System.out.print(" ");
            }
        for(j=1;j<=m;j++) {
            if(i==1||i==m||j==m||j==1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}
