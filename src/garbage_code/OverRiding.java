package garbage_code;

abstract class Person {
    public Person() {
        System.out.println("생성자 A");
        print();
    }
    private void print() {
        System.out.println("저는 Person입니다.");
    }

    abstract public void f();
    public void g() {}
}
class Student extends Person {
    public Student() {
        System.out.println("생성자 B");
        print();
    }
    private void print() {
        System.out.println("저는 Student입니다.");
    }
    public void f() {
        System.out.println("추상 메소드 오버라이딩(구현)하였습니다.");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Person p;
        p = new Student(); //업캐스팅
        p.f();
    }
}