package BasicQuestion;

import java.lang.Math;

public class _28per {
    public static void main(String[] args) {
        double diameter = 12.0;
        double height = 9.0;
        double radius = diameter / 2;
        double surfaceArea = 2 * Math.PI * radius * (height + radius);
        System.out.printf("The surfaceArea:" + surfaceArea);
    }
}
