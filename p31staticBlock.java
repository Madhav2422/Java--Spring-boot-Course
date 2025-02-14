class Mobile{
    int price;
    String brand;
   static String name;

   public Mobile(){
    brand="";
    price=200;
    System.out.println("in constructor");
   }

   static {
     name="Iphone";
    System.out.println("in static block");
   }

    public void show(){
        System.out.println(name + " " + price + " " + brand);
     }

   
}

public class p31staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
    
        //If we want to load only class then 
        Class.forName("Mobile");
       
    }
}

