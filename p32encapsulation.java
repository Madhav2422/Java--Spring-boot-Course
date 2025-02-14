//Encapsulation in Java is the concept of restricting direct access to an object's data by making fields private and providing public getter and setter methods to modify and view them.

class Human{
    private int age=10;;
    private String name="Madhav";

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age=a;
    }

    public String getName(){
        return name;
    }

    public void setName(String b){
        name=b;
    }

}

public class p32encapsulation {
    public static void main(String[] args) {
        Human h1=new Human();

        h1.setAge(30);
        h1.setName("Madhav");

        System.out.println(h1.getAge() + " " + h1.getName());
           
    }
}
