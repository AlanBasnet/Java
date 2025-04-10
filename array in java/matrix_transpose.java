import java.util.*;
public class matrix_transpose {
    public static void main(String[]args){
        int i,j;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the row and column of the matrix:");
        int m = sr.nextInt();
        int n = sr.nextInt();
        int a[][]=new int[5][5];
        System.out.println("Enter the element into the matrix:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++)
            {
                a[i][j] = sr.nextInt();
            }
        }
        System.out.println("The given matrix is :");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the given matrix is :");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++)
            {
             System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
