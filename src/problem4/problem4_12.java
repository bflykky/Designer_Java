package problem4;

import java.util.Scanner;

class Seat {
    static String[] seatS = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    static String[] seatA = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    static String[] seatB = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};

    static void printSeat(String[] seat) {
        if (seatS == seat)
            System.out.print("S" + ">>");
        else if (seatA == seat)
            System.out.print("A" + ">>");
        else
            System.out.print("B" + ">>");

        for (String index : seat)
            System.out.print(" " + index);
        System.out.println();
    }

    static void reserve(String[] seat) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("예약자 이름>> ");
            String inputName = s.next();
            System.out.print("예약 좌석 번호>> ");
            int inputSeatNum = s.nextInt();
            try {
                seat[inputSeatNum - 1] = inputName;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("좌석 번호가 올바르지 않습니다. 다시 시도해 주세요.");
                continue;
            }
        } while (true);
    }

    static void cancelReservation(String[] seat) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("이름>> ");
            String inputName = s.next();
            int count = 0;
            for (int i = 0; i < seat.length; i++) {
               if (seat[i].equals(inputName)) {
                   seat[i] = "---";
                   break;
               }
               else
                   count++;
            }
            if (count == 10)
                System.out.println("입력하신 이름으로 해당된 예약자가 없습니다. 다시 시도해 주세요.");
            else
                break;
        } while(true);
    }
}

public class problem4_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        int inputNum;

        do {
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >> ");
            inputNum = s.nextInt();

            if (inputNum == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>> ");
                inputNum = s.nextInt();
                if (inputNum == 1) {
                    Seat.printSeat(Seat.seatS);
                    Seat.reserve(Seat.seatS);
                }
                else if (inputNum == 2) {
                    Seat.printSeat(Seat.seatA);
                    Seat.reserve(Seat.seatA);
                }
                else if (inputNum == 3) {
                    Seat.printSeat(Seat.seatB);
                    Seat.reserve(Seat.seatB);
                }
                else
                    System.out.println("좌석을 잘못 입력하였습니다. 처음부터 다시 시도해 주세요.");

            }
            else if (inputNum == 2) {
                Seat.printSeat(Seat.seatS);
                Seat.printSeat(Seat.seatA);
                Seat.printSeat(Seat.seatB);
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            else if (inputNum == 3) {
                System.out.print("좌석 S: 1, A: 2, B: 3 >> ");
                inputNum = s.nextInt();
                if (inputNum == 1) {
                    Seat.printSeat(Seat.seatS);
                    Seat.cancelReservation(Seat.seatS);
                }
                else if (inputNum == 2) {
                    Seat.printSeat(Seat.seatA);
                Seat.cancelReservation(Seat.seatA);
                }
                else if (inputNum == 3) {
                    Seat.printSeat(Seat.seatB);
                    Seat.cancelReservation(Seat.seatB);
                }
                else
                    System.out.println("좌석을 잘못 입력하였습니다. 처음부터 다시 시도해 주세요.");
            }
            else if (inputNum == 4)
                break;
            else {
                System.out.println("없는 메뉴입니다. 다시 시도해 주세요.");
                continue;
            }
        } while (true);
        s.close();
    }
}