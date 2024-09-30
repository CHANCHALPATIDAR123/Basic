package BasicQuestion;

import java.lang.Math;

public class _26per {
    public static void main(String[] args) {
        double surfaceArea = 149.0;
        double height = 6.0;
        double r = (surfaceArea / (2 * Math.PI)) - (height / 2);
        double diameter = r * 2;
        System.out.printf("The diameter:" + diameter);
    }
}
