public class string_builder {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Pony");
        System.out.println(sb);
        // print character at index 0
        System.out.println(sb.charAt(0));
        // set character at index 0 (replace)
        sb.setCharAt(0,'T');
        System.out.println(sb);  
        // at insert new string
        sb.insert(0,'S');
        sb.insert(3,'n');
        System.out.println(sb);
        // delete extra n
        sb.delete(1,6); //ending index is not included.
        System.out.println(sb);
        // append (adding at end)
        sb.append("t");
        sb.append('o');
        sb.append('n');
        sb.append('e');
        System.out.println(sb);
    }
    
}

