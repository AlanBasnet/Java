        // Number pyramid.
/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 */
public class number_pyramid {
    public static void main(String[]args){
        int m =5;
        int i,j;
        for(i=1;i<=m;i++){
            for(j=i;j<m;j++){
                System.out.print(" ");
            }
        for(j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
        }
    }
    
}
