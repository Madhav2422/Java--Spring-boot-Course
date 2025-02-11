public class p5conversion {
    public static void main(String[] args) {

        byte b = 127;
        int a = 265;
        byte k = (byte) a; // type casting  and it is known as explicit conversion


        float f=5.6f;
        int t=(int)f;

        System.out.println(t);


        // Type Promotion

        byte x=20;
        byte y=30;

        int z= x*y;

        System.out.println(z);

    }
}
