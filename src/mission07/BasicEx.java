package mission07;

import java.util.Scanner;

public class BasicEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("숫자 두개와 연산자(+,-,*,/)를 입력하면");
        System.out.println("계산되는 간단한 계산기입니다.**********");

        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 = input.nextInt();
        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("연산자(+,-,*,/)를 입력해주세요: ");
        String operator = input.nextLine();

        if(operator.equals("+")){
            int result= num1+num2;
            System.out.println(num1+" + "+num2+" = "+result+"입니다.");
        }else if(operator.equals("-")){
            int result= num1-num2;
            System.out.println(num1+" - "+num2+" = "+result+"입니다.");
        }else if(operator.equals("*")){
            int result= num1*num2;
            System.out.println(num1+" * "+num2+" = "+result+"입니다.");
        }else if(operator.equals("/")){
            if (num2 == 0) {
                System.out.println("0으로 나눌수 없습니다.");
                System.out.print("두번째 숫자를 다시 입력해주세요: ");
                num2 = input.nextInt();
            }
            int result= num1/num2;
            System.out.println(num1+" / "+num2+" = "+result+"입니다.");
        }else{
            System.out.println("잘못된 연산자를 입력하였습니다.");
        }
    }
}