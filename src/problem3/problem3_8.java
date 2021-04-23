package problem3;

import java.util.Scanner;

public class problem3_8 {
    public static void main(String[] args) {
        int[] arr;
        Scanner s = new Scanner(System.in);
        System.out.print("정수 몇 개? : ");
        int size = s.nextInt();
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            int temp = (int) (Math.random() * 100 + 1);
            arr[i] = temp;

            for (int j = 0; j < i; j++) {
                if (temp == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            if ((i+1) % 10 == 0)
                System.out.println();
        }

        s.close();

    }
}
