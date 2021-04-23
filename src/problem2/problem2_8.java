package problem2;

import java.util.Scanner;

public class problem2_8 {

    //힌트로 주어진 메소드
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ( (x >= rectx1 && x <= rectx2) && ( y >= recty1 && y <= recty2) )
            return true;
        else
            return false;
    }
    //trans_Inrect 메소드는 문제 힌트에서 주어진 inRect 메소드를 더 한정적인 상황에서, 더 적은 입력을 받고도 이용할 수 있도록 변형함.
    public static boolean trans_Inrect(int x, int y) {
        if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        //주어진 사각형의 좌측 상단 점 = (100,100)
        //주어진 사각형의 우측 하단 점 = (200,200)

        int left_up_x, left_up_y;
        int right_down_x, right_down_y;
        int left_down_x, left_down_y;
        int right_up_x, right_up_y;
        Scanner s = new Scanner(System.in);

        System.out.printf("직사각형을 구성하는 좌측 상단의 점의 좌표를 입력해 주세요 : ");
        left_up_x = s.nextInt();
        left_up_y = s.nextInt();
        System.out.printf("직사각형을 구성하는 우측 하단의 점의 좌표를 입력해 주세요 : ");
        right_down_x = s.nextInt();
        right_down_y = s.nextInt();

        /*
         입력받은 두 점을 통해서 직사각형의 네 점의 좌표를 모두 알아낼 수 있음.
         이를 통해 ,네 점을 boolean 자료형을 반환하는 inRect 메소드에 입력했을 때 한 점이라도 true를 반환한다면,
         이는 주어진 직사각형과 충돌한다는 사실을 증명한다.
         */

        left_down_x = left_up_x;
        left_down_y = right_down_y;
        right_up_x = right_down_x;
        right_up_y = left_up_y;

        if ( trans_Inrect(left_up_x, left_up_y) || trans_Inrect(left_down_x, left_down_y) || trans_Inrect(right_down_x, right_down_y) || trans_Inrect(right_up_x, right_up_y) )
            System.out.println("입력받은 직사각형은 (100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        else
            System.out.println("입력받은 직사각형은 (100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌하지 않습니다.");

        s.close();

    }

}
