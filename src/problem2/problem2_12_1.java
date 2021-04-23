package problem2;

import java.util.Scanner;

public class problem2_12_1 {
    public static void main(String[] args) {

        double operand1, operand2;
        double result;
        Scanner s = new Scanner(System.in);

        System.out.printf("연산 >> ");
        operand1 = s.nextDouble();
        String operator = s.next();
        operand2 = s.nextDouble();

        //(1) if-else문을 이용하여 연산식을 구분하는 경우
        if ( operator.equals("+") ) {
            result = operand1 + operand2;
            System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + result);
        }
        else if ( operator.equals("-") ) {
            result = operand1 - operand2;
            System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + result);
        }
        else if ( operator.equals("*") ) {
            result = operand1 * operand2;
            System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + result);
        }
        else if ( operator.equals("/") ) {
            if (operand2 == 0)
                System.out.println("0으로 나눌 수 없습니다.");
            else {
                result = operand1 / operand2;
                System.out.println(operand1 + operator + operand2 + "의 계산 결과는 " + result);
            }
        }
        else
            System.out.println("+,-,*,/ 이외의 연산자가 입력되었습니다. 다시 시도해 주세요.");

        s.close();

    }
}
