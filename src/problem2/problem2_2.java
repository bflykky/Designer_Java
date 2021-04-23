package problem2;

import java.util.Scanner;

public class problem2_2 {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.printf("2자리수 정수 입력(10~99) >> ");
        int num;
        num = s.nextInt();
        if ((num / 10) == (num % 10))
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");

        s.close();
    }
}
