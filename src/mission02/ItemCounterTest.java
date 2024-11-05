package mission02;

public class ItemCounterTest {

    public static void main(String[] args) {
        ItemCounter counter1 = new ItemCounter();
        ItemCounter counter2 = new ItemCounter();
        ItemCounter counter3 = new ItemCounter();

        counter1.addItem();
        System.out.println("counter1 = " + counter1.totalCount);
        System.out.println("counter2 = " + counter2.totalCount);
        System.out.println("counter3 = " + counter3.totalCount);

        counter2.addItem();
        System.out.println("counter1 = " + counter1.totalCount);
        System.out.println("counter2 = " + counter2.totalCount);
        System.out.println("counter3 = " + counter3.totalCount);
    }
}
