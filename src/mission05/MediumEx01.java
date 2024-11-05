package mission05;

public class MediumEx01 {
    public static void main(String[] args) {

        int i = 0;
        do {
            i++;

            if (i % 2 == 0) continue;
            System.out.println(i);

        } while (i < 20);

    }
}
