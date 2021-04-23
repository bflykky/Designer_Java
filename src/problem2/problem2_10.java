package problem2;

import java.util.Scanner;

public class problem2_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x1, y1;
        int x2, y2;
        int r1, r2;
        System.out.printf("첫번째 원의 중심과 반지름 입력 >> ");
        x1 = s.nextInt();
        y1 = s.nextInt();
        r1 = s.nextInt();
        //첫번째 원은 (x1,y1)을 중심으로 하고 반지름이 r1인 원.

        System.out.printf("두번째 원의 중심과 반지름 입력 >> ");
        x2 = s.nextInt();
        y2 = s.nextInt();
        r2 = s.nextInt();
        //두번째 원은 (x2,y2)을 중심으로 하고 반지름이 r2인 원.

        //두 원이 겹치는지 판단을 하기 위해선, 두 점 사이의 거리와 두 점의 반지름을 더한 것을 비교를 해보면 된다.
        //두 점 사이의 거리를 구하기 위해 Math.sqrt() (루트 구하기) 메소드와 Math.pow() (제곱 구하기) 메소드를 사용함.
        double distance_circle1_circle2 = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) );

        if (r1+r2 >= distance_circle1_circle2) //두 원이 접하는 경우(r1+r2 == distance_circle1_circle2 인 경우)에도 겹친다고 가정함.
            System.out.println("두 원은 서로 겹칩니다.");
        else
            System.out.println("두 원은 서로 겹치지 않습니다.");

        s.close();
    }
}
