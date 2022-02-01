package Doit_Java.chapter6.staticEX;

public class StudentTest1 {
    public static void main(String[] args) {

        System.out.println(Student.getSerialNum());

        Student student1 = new Student();
        System.out.println(student1.studentID);

        Student student2 = new Student();
        System.out.println(student2.studentID);
    }
}
