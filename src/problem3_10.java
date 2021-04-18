public class problem3_10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        //현재 4x4의 2차원 배열 arr은 0으로 초기화된 상태임.
        for (int i = 0; i < 10; i++) {
            int tmp_index1 = (int) (Math.random() * 10) % 4;
            int tmp_index2 = (int) (Math.random() * 10) % 4;
            if (arr[tmp_index1][tmp_index2] == 0)
                arr[tmp_index1][tmp_index2] = (int) (Math.random() * 10 + 1);
            else
                i--;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(arr[i][j] + "  ");
            if (i != 3)
                System.out.println();
        }
    }
}
