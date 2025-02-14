//Static means creating one copy of variable and sharing to all other objects
//It belongs to the class not the object

class Mobile{
     static String name;
    int price;  //Instance variable
    String brand;

  public void show(){
        System.out.println(name + " " + price + " " + brand);
  }

}

public class p29staticvariable {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        
       Mobile.name="Iphone 13";
        m1.price=22222;
        m1.brand="Apple";

         
        // m2.name="Iphone 15";
        m2.price=100000;
        m2.brand="Apple";

        m1.show();
        m2.show();


    }
}
