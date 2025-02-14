//this represents the current object .It means the obj calling the method

class Human{
    private int age=10;;
    private String name="Madhav";

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}


public class p33this {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.setAge(30);
        h1.setName("Madhav");

        System.out.println(h1.getAge() + " " + h1.getName());
 }   

}
