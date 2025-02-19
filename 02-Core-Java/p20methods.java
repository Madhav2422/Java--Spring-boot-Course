class Computer{

    public void playMusic(){
        System.out.println("Music Player");
    }

    public String getPen(int cost){ //Here cost is the local variable
        if(cost>3)
            return "Pen";
        else
           return "Nothing";
    }

}


public class p20methods {
    public static void main(String[] args) {
        Computer obj=new Computer();// To create a object 
        obj.playMusic();
        String str= obj.getPen(2);
        System.out.println(str);
    }
}
