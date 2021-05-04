package garbage_code;

public class check {
    public static void A() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        check dummy = new check();
        check.A();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        Human John = new Human();
        Human.A();
    }
}

class Human extends check {
    public static void A() {
        System.out.println("B");
    }
}


