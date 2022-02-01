package Doit_Java.chapter6;

class Person {

    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.returnSelf());

        Person p2 = new Person("홍길동", 50);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}
