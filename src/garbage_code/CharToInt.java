package garbage_code;

public class CharToInt {
    public static void main(String[] args) {
        char a = '\u0041';
        ++a;
        int b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
