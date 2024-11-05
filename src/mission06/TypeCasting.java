package mission06;

public class TypeCasting {
    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();
        int a = typeCasting.castToInteger(10.5);
        System.out.println("a = " + a);
    }
    public int castToInteger(double value){
        return (int)value;
    }
}
