package mission06;

public class TypeCastingChallenge {

    public static void main(String[] args) {
        TypeCastingChallenge t = new TypeCastingChallenge();
        short result = t.addAndCast(20L,100000);

        System.out.println(result);
    }

    public short addAndCast(long num1, int num2){
        return (short) ( num1+ num2);
    }
}
