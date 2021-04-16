import java.util.Scanner;

public class problem3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        String str = s.next();
        char c = str.charAt(0);


        for (; c > 0x60; c--) {
            for (char j = 0x61; j <= c; j++)
                System.out.print(j);
            System.out.println();
        }

        s.close();
    }
}
