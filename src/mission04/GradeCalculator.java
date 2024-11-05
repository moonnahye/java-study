package mission04;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("점수(0~100)를 입력하세요: ");

        int score = input.nextInt();

        if(score >= 90){
            System.out.println("등급은 'A'입니다.");
        }else if(80 <= score && score < 90){
            System.out.println("등급은 'B'입니다.");
        }else if(70 <= score && score < 80){
            System.out.println("등급은 'C'입니다.");
        }else {
            System.out.println("등급은 'F'입니다.");
        }
    }
}
