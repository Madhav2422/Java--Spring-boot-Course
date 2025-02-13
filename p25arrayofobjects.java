class Student{
    int rollno;
   String name;
}


public class p25arrayofobjects {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.rollno=1;
        s1.name="Madhav";

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Vansh";

        Student s3=new Student();
        s3.rollno=3;
        s3.name="Sahil";

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].rollno + " " + students[i].name);
        // }

        // for each loop
        for(Student stud:students){
            System.out.println(stud.rollno + " : " + stud.name);
        }
        
    }
}
