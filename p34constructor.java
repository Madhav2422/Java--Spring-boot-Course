//Constructor name is same as class name .It doesnt return anything .

class Human{
    private int rollno;
    private String name;

    public Human(){
        rollno=12;
        name="Madhav";
        System.out.println(rollno + "  " + name);
    }

}

public class p34constructor {
    public static void main(String[] args) {
        Human h1= new Human();
    
    }
}
