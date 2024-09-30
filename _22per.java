package BasicQuestion;

public class _22per {
    public static void main(String[] args) {
        double pathLength = 120.0;
        double pathBreadth = 2.4;
        double brickLength = 24.0;
        double brickBreadth = 15.0;

        double brickArea = (brickLength / 100) * (brickBreadth / 100);

        double pathArea = pathLength * pathBreadth;
        int numberOfBricks = (int) (pathArea / brickArea);
        System.out.printf("Number of bricks required:" + numberOfBricks);
    }
}
