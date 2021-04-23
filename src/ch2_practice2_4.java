/*
코드 작성 목적 : scanner 클래스는 입력받지 않으면 언제 프로그램이 종료되는지 확인하기 위함
확인 결과 : scanner.close(); 함수가 실행되기 전 위 scanner.next() 함수 관련 코드들이 입력을 받아 다 실행이 되어야 출력문까지 실행 후 close 함수가 실행됨.
 */
import java.util.Scanner;
public class ch2_practice2_4 {
    public static void main(String[] args) {
        System.out.println("입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름 : " + name + ",");

        String city = scanner.next();
        System.out.println("도시 : " + city + ",");

        int age = scanner.nextInt();
        System.out.println("나이 : " + age + "세,");

        double weight = scanner.nextDouble();
        System.out.println("몸무게 : " + weight + "kg,");

        boolean isSingle = scanner.nextBoolean();
        System.out.println("결혼여부 : " + isSingle + "입니다.");

        scanner.close();
    }
}
