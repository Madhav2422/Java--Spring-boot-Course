public class p16nestedwhileloop {
    public static void main(String[] args) {
        int i =1;

        while(i<=4){
            System.out.println("hii " + i);

            int j=1;
            while(j<=3){
                System.out.println("Hello ji " + j);
                j++;
            }

            i++;
        }

        System.out.println("bye");
    }
}
