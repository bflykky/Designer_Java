//problem4_6의 답 소스코드
import java.util.Scanner;

class Circle {
    double x, y;
    int radius;

    public Circle(double x, double y, int radius) {
        this.x = x; this.y = y; this.radius = radius;
    }
}

public class problem4_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle[] c = new Circle [3];
        Circle BiggestC;

        for(int i=0; i<c.length; i++) {
            System.out.print("x, y, radius >> ");
            double x = s.nextDouble();
            double y = s.nextDouble();
            int radius = s.nextInt();

            c[i] = new Circle(x,y,radius);
        }

        if (c[0].radius >= c[1].radius && c[0].radius >= c[2].radius)
            BiggestC = c[0];
        else if (c[1].radius >= c[0].radius && c[1].radius >= c[2].radius)
            BiggestC = c[1];
        else
            BiggestC = c[2];

        System.out.printf("가장 면적이 큰 원은 (%.1f,%.1f)%d\n", BiggestC.x, BiggestC.y, BiggestC.radius);
        s.close();
    }
}