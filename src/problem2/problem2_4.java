package problem2;

import java.util.Scanner;

public class problem2_4 {
    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner s = new Scanner(System.in);
        System.out.printf("정수 3개 입력 >> ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        if ( (num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2) )
            System.out.println("중간값은 "+ num1);
        else if ( (num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1) )
            System.out.println("중간값은 "+ num2);
        else
            System.out.println("중간값은 "+ num3);

        s.close();


    }
}
