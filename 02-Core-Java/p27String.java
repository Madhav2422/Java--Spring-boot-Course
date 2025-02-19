//Strings are immutable in java(they cannot change)

public class p27String {
    public static void main(String[] args) {
        String name=new String("madhav");
        String surname="Hiranii";    //String will create object

        System.out.println("Hello " + name);
        System.out.println(name.charAt(5));
    }
}
