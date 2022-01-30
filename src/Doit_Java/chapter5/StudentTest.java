package Doit_Java.chapter5;

public class StudentTest {
    public static void main(String[] args){

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student(101, "김유신");
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);

    }
}
