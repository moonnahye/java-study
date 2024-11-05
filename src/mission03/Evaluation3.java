package mission03;

import java.util.Scanner;

public class Evaluation3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1*num2;

        if(num1>0 && num2<0){
            System.out.println(result);
        }
    }
}
