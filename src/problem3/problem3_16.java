package problem3;

import java.util.Scanner;

public class problem3_16 {
    public static void main(String[] args) {
        //컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음 그림을 참고.
        //독자부터 시작
        //가위,바위,보 중 하나 입력.
        //프로그램도 무작위로 하나 선정 후, 독자 값과 비교
        //승패 여부 판단
        //그만 입력 시 프로그램 종료
        String[] str = {"가위", "바위", "보"};
        Scanner s = new Scanner(System.in);
        String my_card;
        int com_index;

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        do {
            System.out.print("가위 바위 보! >> ");

            my_card = s.next(); //내 패 결정.
            com_index = (int) (Math.random() * 3); //컴퓨터의 패는 인덱스 랜덤 뽑기를 통해 결정.

            if (my_card.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            switch (my_card) {
                case "가위":
                    if (str[com_index].equals("가위"))
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 비겼습니다");
                    else if (str[com_index].equals("바위"))
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 컴퓨터가 이겼습니다");
                    else //com_index가 3이라고 가정하고, 컴퓨터의 패가 "보"라고 전제한 else문
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 사용자가 이겼습니다.");
                    break;

                case "바위":
                    if (str[com_index].equals("가위"))
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 사용자가 이겼습니다");
                    else if (str[com_index].equals("바위"))
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 비겼습니다");
                    else //com_index가 3이라고 가정하고, 컴퓨터의 패가 "보"라고 전제한 else문
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 컴퓨터가 이겼습니다.");
                    break;

                case "보":
                    if (str[com_index].equals("가위"))
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 컴퓨터가 이겼습니다");
                    else if (str[com_index].equals("바위"))
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 사용자가 이겼습니다");
                    else //com_index가 3이라고 가정하고, 컴퓨터의 패가 "보"라고 전제한 else문
                        System.out.println("사용자 = " + my_card + ", 컴퓨터 = " + str[com_index] + ", 비겼습니다.");
                    break;
            }
        } while (true);

        s.close();
    }
}
