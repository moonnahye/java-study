package mission04;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("두 개의 숫자를 입력하세요 : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.print("연산자(+,-,*,/)를 입력하세요: ");
        String operator = input.next();

        int result;

        if(operator.equals("+")){
            result = number1+number2;
            System.out.println(number1+" + "+number2+" = "+result);
        }else if(operator.equals("-")){
            result = number1-number2;
            System.out.println(number1+" - "+number2+" = "+result);
        }else if(operator.equals("*")){
            result = number1*number2;
            System.out.println(number1+" * "+number2+" = "+result);
        }else if(operator.equals("/")){
            result = number1/number2;
            System.out.println(number1+" / "+number2+" = "+result);
        }else{
            System.out.println("잘못된 연산자를 입력하셨습니다.");
        }
    }
}
