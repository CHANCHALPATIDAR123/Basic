package BasicQuestion;

class AreaRegion {
    public static void main(String[] args) {

        int Length = 520;
        int Breadth = 140;

        int tileLength = 13;
        int tileBreadth = 7;

        int areaOfRegion = Length * Breadth;

        int areaOfTile = tileLength * tileBreadth;

        int number = areaOfRegion / areaOfTile;

        System.out.println("Number of tiles required: " + number);
    }
}
