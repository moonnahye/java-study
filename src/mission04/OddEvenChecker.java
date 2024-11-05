package mission04;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println("입력한 숫자는 '짝수'입니다.");
        } else {
            System.out.println("입력한 숫자는 '홀수'입니다.");
        }
    }
}
