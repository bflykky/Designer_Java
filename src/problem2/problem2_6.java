package problem2;

import java.util.Scanner;
public class problem2_6 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.printf("1~99 사이의 정수를 입력하시오 >> ");

        num = s.nextInt();
        if (num >= 10)
        {
            if ((num / 10) % 3 == 0) {
                System.out.print("박수짝");
                if ((num % 10) % 3 == 0)
                    System.out.println("짝");
            }
            else
            if ((num % 10) % 3 == 0)
                System.out.println("박수짝");
            
        } 
        else
        {
            if (num % 3 == 0)
                System.out.println("박수짝");
        }
        s.close();
    }
}