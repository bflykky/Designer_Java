import java.util.Scanner;
public class ch2_chktime2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요 : ");

        int a = s.nextInt();
        int b = s.nextInt();

        s.close();
        System.out.println("합 : " + (a+b));
    }

}
