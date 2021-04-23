package problem3;

import java.util.Scanner;

public class problem3_6 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner s = new Scanner(System.in);
        int price;
        System.out.print("금액을 입력하시오 >> ");
        price = s.nextInt();
        //System.out.println("test");
        for (int i = 0; i < 8; i++) {
            if (price / unit[i] != 0) {
                System.out.println(unit[i] + "원 짜리 : " + price / unit[i] + "개");
                price %= unit[i];
            }

        }
        s.close();
    }
}
    