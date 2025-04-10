        //Butterfly pattern
/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */

public class butterfly {
    public static void main(String[]args){
        int i,j,m=4;
        for(i=1;i<=m;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(m-i);j++){

                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
        
        System.out.println();
        }
        for(i=1;i<=m;i++){
            for(j=i;j<=m;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(i-1);k++){

                System.out.print(" ");
            }
            for(j=i;j<=m;j++){
                System.out.print("*");
            }
        
        System.out.println();
        }
    }
    
}
