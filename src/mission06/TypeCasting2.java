package mission06;

import java.util.Scanner;

public class TypeCasting2 {
    public static void main(String[] args) {

        TypeCasting2 casting = new TypeCasting2();

        int toInt = casting.castToInteger(50.0,10);
        float toFloat = casting.castToFloat(50.0,10);
        double toDouble = casting.castToDouble(50.1f,10);

        System.out.println("toInt = " + toInt);
        System.out.println("toFloat = " + toFloat);
        System.out.println("toDouble = " + toDouble);
    }
    public int castToInteger(double a, int b){
        return (int) (a+b);
    }

    public float castToFloat(double a, int b){
        return (float)(a+b);
    }

    public double castToDouble(float a, int b){
        return a+b;
    }
}
