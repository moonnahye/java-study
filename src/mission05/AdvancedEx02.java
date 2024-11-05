package mission05;

public record AdvancedEx02() {
    public static void main(String[] args) {

        int num = 5;
        int i = 0;
        while (true) {
            int j = 1;
            int k = 2 * num - 1;
            while (j <= i) {
                System.out.print(" ");
                j++;
            }
            while (k >= 2 * i + 1) {
                System.out.print("*");
                k--;
            }
            System.out.println("");
            i++;
            if (i > num)
                break;
        }
    }
}
