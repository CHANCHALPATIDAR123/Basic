package BasicQuestion;

class CostCalculator {
    public static void main(String[] args) {

        double length = 300.0;
        double width = 150.0;

        double sq = 6.0;

        double area = length * width;
        double cost = (area / 100) * sq;

        // Output the result
        System.out.printf("The cost of tiling the rectangular" + cost);
    }
}
