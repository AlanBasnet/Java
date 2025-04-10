import java.util.*;

public class circle {
    public static double circum(double r){
        return 2*3.14*r;
    }
    public static void main(String[]args){
        System.out.println("Enter the radius");
        Scanner sr = new Scanner (System.in);
        double r = sr.nextDouble();
        System.out.println("The circumference of the circle is :"+circum(r));
        sr.close();
    }
    
}
