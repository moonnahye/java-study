package mission05;

public record AdvancedEx03() {
    public static void main(String[] args) {

        int num = 4;

        for (int i = 0; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
