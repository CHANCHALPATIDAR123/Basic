package BasicQuestion;

class _8per {
    public static void main(String[] args) {

        double altitude = 20.0;
        double areaInM2 = 0.8;
        double areaInCm2 = areaInM2 * 10000;
        double base = (2 * areaInCm2) / altitude;
        System.out.printf("The base of the triangle is:" + base);
    }
}
