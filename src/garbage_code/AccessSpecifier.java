package garbage_code;

public class AccessSpecifier {
    private int priv = 0;
    protected int prot = 0;
}

class Sub extends AccessSpecifier {
    void f() {

        this.prot = 2;
    }
    public static void main(String[] args) {

    }
}
