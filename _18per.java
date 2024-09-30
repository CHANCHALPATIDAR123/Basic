package BasicQuestion;

public class _18per {
    public static void main(String[] args) {
        double cubeEdge = 7.0;
        double cuboidLength = 7.0;
        double cuboidBreadth = 4.0;
        double cuboidHeight = 8.0;
        double volumeCube = Math.pow(cubeEdge, 3);
        double volumeCuboid = cuboidLength * cuboidBreadth * cuboidHeight;
        if (volumeCube > volumeCuboid) {
            System.out.printf("The cube has more volume:" + volumeCube, volumeCuboid);
        } else {
            System.out.printf("The cuboid has more volume:" + volumeCuboid, volumeCube);
        }
    }
}
