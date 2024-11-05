package mission03;

import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("두개의 정수를 입력하세요 : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("두 숫자의 합은 "+ sum +"입니다.");
    }
}
