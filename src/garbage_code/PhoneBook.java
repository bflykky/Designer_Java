package garbage_code;
//problem4_8
import java.util.Scanner;

class PhoneA {
    String name;
    String tel;
    public PhoneA() {

    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        String name_check;
        int member;

        System.out.print("인원수 >> ");
        member = s.nextInt();
        PhoneA[] p = new PhoneA[member];
        for ( int i = 0; i < member; i++) {
            p[i] = new PhoneA();
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
            p[i].name = s.next();
            p[i].tel = s.next();
        }
        System.out.println("저장되었습니다...");

        do {
            System.out.print("검색할 이름 >> ");
            name_check = s.next();

            if (name_check.equals("그만"))
                break;

            for (int i = 0; i < member; i++) {
                if (name_check.equals(p[i].name)) {
                    System.out.println(name_check + "의 번호는 " + p[i].tel + " 입니다.");
                    break;
                }
                else {
                    if (i == member-1)
                        System.out.println(name_check + " 이 없습니다.");
                }
            }

        } while (true);

        s.close();
    }
}
