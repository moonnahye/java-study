package mission03;

public class Evaluation1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 5;

        if (x != 0 && y++ > 2) {
            System.out.println("조건이 참입니다.");
        }
        System.out.println("y의 값: " + y);
    }
}
