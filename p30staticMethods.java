class Mobile{
    int price;
    String brand;
   static String name;

    public void show(){
        System.out.println(name + " " + price + " " + brand);
     }

     //Static method
     public static void show1(Mobile obj){
        System.out.println(obj.brand + " " + obj.price + " " + name);
     }
}

public class p30staticMethods {

    
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
        Mobile.show1(m2);

    }
}
