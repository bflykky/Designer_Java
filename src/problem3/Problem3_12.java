package problem3;

public class Problem3_12 {
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
