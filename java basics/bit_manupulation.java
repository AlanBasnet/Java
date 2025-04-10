public class bit_manupulation {
    public static void main(String[]args){
        int n = 5;
        int pos = 2;
        int bitMarks = 1<<pos;

        if((bitMarks & n) == 0){
            System.out.println("The bit was zero.");
        else{
            System.out.println("The bit was one.");
        }
        }

    }
    
}
