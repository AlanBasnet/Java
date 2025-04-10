        // inverted half piramid (with 180 degree rotation)
/*
   *
  **
 ***
****
 */
public class inverted_half_pyramid {
    public static void main(String[]args){
        int m= 4;
        for(int i=1;i<=m;i++){
            for(int j=i;j<m;j++){
                System.out.print(" ");

            }
          
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
