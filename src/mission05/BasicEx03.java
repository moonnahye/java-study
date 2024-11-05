package mission05;

public class BasicEx03 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
