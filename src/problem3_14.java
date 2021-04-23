import java.util.Scanner;

public class problem3_14 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        Scanner s = new Scanner(System.in);
        String stop_keyword = "그만";
        String name;
        do {
            System.out.print("과목 이름 >> ");
            name = s.next();

            if (name.equals(stop_keyword))
                break;

            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (course[i].equals(name)) {
                    int n = score[i];
                    System.out.println(course[i] + "의 점수는 " + n);
                    break;
                }
                else {
                    count++;
                    if (count == 5)
                        System.out.println("없는 과목입니다.");
                }
            }
        } while (true);

        s.close();
    }
}
