package mission04;

import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("세 개의 숫자를 입력하세요.");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int MaxNumber;

        if(number1>number2 && number1>number3){
            MaxNumber= number1;
        }else if(number2>number1 && number2>number3){
            MaxNumber = number2;
        }else {
            MaxNumber = number3;
        }

        System.out.println("가장 큰 숫자는 "+MaxNumber+"입니다.");
    }
}
