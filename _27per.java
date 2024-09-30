package BasicQuestion;

import java.lang.Math;

public class _27per {
    public static void main(String[] args) {
        double volume = 1287.0;
        double radius = 10.0;
        double height = volume / (Math.PI * Math.pow(radius, 2));
        double surfaceArea = 2 * Math.PI * radius * (height + radius);
        System.out.printf("The area of the surface:" + surfaceArea);
    }
}
