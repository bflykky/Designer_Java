public class problem3_12 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int sum = 0;
        int i = 0;
        while(i < args.length) {
            try {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
                i++;
            } catch (NumberFormatException e) {
                System.out.println(args[i] + "는 정수로 변환할 수 없습니다.");
                i++;
            }
        }
        System.out.println(sum);
    }
}
