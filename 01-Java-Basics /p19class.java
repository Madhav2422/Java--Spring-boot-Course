//Class: A blueprint or template that defines properties (variables) and behaviors (methods) of an object.
//Object: An instance of a class that has its own values for the properties and can use the defined methods.

//The new keyword in Java is used to create an object of a class by allocating memory and calling its constructor.

class calculator {

    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}

public class p19class {
    public static void main(String[] args) {

        int a;
        int b;

        calculator calc = new calculator();
        int r = calc.add(4, 5);
        System.out.println(r);
    }
}
