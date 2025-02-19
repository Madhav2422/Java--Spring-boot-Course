//We use String Buffer and String Builder to mutate the string
// String Buffer is thread safe and string builder is not thread safe

public class p28StringBuffer {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("madhav");

        sb.append("Hirani");

        System.out.println(sb);
    }
}
