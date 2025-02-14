
class Human{
    private int rollno;
    private String name;

    public Human()    
    {
        rollno=12;
        name="Madhav";
        System.out.println(rollno + "  " + name);
    }

    public Human(int a ,String n) //Parametrized constructor
    {
        rollno=a;
        name=n;

        System.out.println(rollno + " " + name);
    }

}

public class p35prametrizedconstructor {
    public static void main(String[] args) {
        Human h1= new Human();
        Human h2= new Human(22,"Jack");
     }
}
