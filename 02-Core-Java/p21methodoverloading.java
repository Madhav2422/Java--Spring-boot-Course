class  Calculator{

    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public double add(int a,double b){
        return a+b;
    }

}

public class p21methodoverloading {
    public static void main(String[] args) {

        Calculator obj=new Calculator();

        int r1=obj.add(2, 4);
        int r2=obj.add(2,34,4 );
        int r3=obj.add(3, 4);
        System.out.println(r1 + " & " + r2 + " " +r3);
    }
}
