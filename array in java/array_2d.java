import java.util.*;
public class array_2d {
    public static void main (String[]args){
        int i,j;
        Scanner sr = new Scanner (System.in);
        int a[][] = new int[2][3];
        System.out.println("Enter the element into the array:");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                a[i][j]=sr.nextInt();
            }
        }
        System.out.println("The matrix of given number is :");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number to be searched:");
        int x = sr.nextInt();
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                if(a[i][j]==x){
                    System.out.println("The number is found in "+(i+1)+","+(j+1)+" position.");
                }
            }
        }
        sr.close();
    }
}
