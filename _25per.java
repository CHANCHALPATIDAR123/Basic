package BasicQuestion;

class _26per {
    public static void main(String[] args) {
        double floorLength = 800.0;
        double floorBreadth = 900.0;
        double tileSide = 10.0;
        double floorArea = floorLength * floorBreadth;
        double tileArea = Math.pow(tileSide, 2);
        int numberOfTiles = (int) (floorArea / tileArea);

        System.out.printf("Number:" + numberOfTiles);
    }
}
