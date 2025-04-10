public class demo {
    public int sum(int a,int b){
        int result=a+b;

        return result;
    }
    
    public static void main(String[]args) throws Exception{
        System.out.println("Hello world");
        demo democlass=new demo();
        System.out.println(democlass.sum(3,2));
    }
}
