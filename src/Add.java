//Add.java는 problem3_12번 문제의 답 소스코드 파일이다.

public class Add {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int sum = 0;
        int i = 0;
        while(i < args.length) {
            try {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }
            catch (NumberFormatException e) { }
            finally {
                i++;
            }
        }
        System.out.println(sum);
    }
}
