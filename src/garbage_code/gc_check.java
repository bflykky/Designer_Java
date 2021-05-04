package garbage_code;

public class gc_check {
    int i;
    double d;
    gc_check() {
        System.out.println("Hi");
    }

    void pp() {
        System.out.println("method hihi");
    }

    public static void main(String[] args) {
        gc_check c1 = new gc_check();
        gc_check c2 = new gc_check();
        gc_check c3 = new gc_check();

        c2 = null;
        System.gc();

    }
}
