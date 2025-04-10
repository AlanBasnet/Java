        // Hollow butterfly
/*
*      *
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
*      *
 */

public class hollow_butterfly {
    public static void main (String []args){
        int i,j,m=8;
        for(i=1;i<=m;i++){
            for(j=1;j<=m;j++){
                if(j==1||j==m||i==j||(i+j)==(m+1)){
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
