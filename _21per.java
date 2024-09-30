package BasicQuestion;

public class _21per {
    public static void main(String[] args) {
        int numberOfBricks = 100;
        double brickLength = 24.0;
        double brickBreadth = 15.0;
        double brickArea = (brickLength / 100) * (brickBreadth / 100);
        double totalArea = numberOfBricks * brickArea;

        System.out.printf("Area of the path:" + totalArea);
    }
}
