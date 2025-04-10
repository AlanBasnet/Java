        // Pascal Triangle
/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 */

public class pascal_triangle {
    public static void main(String []args){
        int i,j,m=5;
        for(i=1;i<=m;i++){
            for(j=i;j<m;j++){
                System.out.print(" ");
            }
        for(j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
    
}
