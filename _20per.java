package BasicQuestion;

public class _20per {
    public static void main(String[] args) {
        double wallLength = 15.0;
        double wallBreadth = 10.0;
        double wallHeight = 8.0;

        double brickLength = 15.0;
        double brickBreadth = 8.0;
        double brickHeight = 5.0;

        wallLength *= 100;
        wallBreadth *= 100;
        wallHeight *= 100;

        double wallVolume = wallLength * wallBreadth * wallHeight;
        double brickVolume = brickLength * brickBreadth * brickHeight;

        int numberOfBricks = (int) (wallVolume / brickVolume);

        System.out.printf("Number of bricks required:" + numberOfBricks);
    }
}
