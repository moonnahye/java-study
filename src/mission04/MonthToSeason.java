package mission04;

import java.util.Scanner;

public class MonthToSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("월(1~12)을 입력하세요 : ");
        int month = input.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println(month+"월은 '봄'입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"월은 '여름'입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month+"월은 '가을'입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month+"월은 '겨울'입니다.");
                break;
        }
    }
}
