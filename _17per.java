package BasicQuestion;

public class _17per {
    public static void main(String[] args) {
        double length = 50.0;
        double breadth = 30.0;
        double distanc = 2 * (length + breadth);
        double totalMeters = distanc * 10;
        double totalDistanceKm = totalMeters / 1000;

        System.out.println(totalDistanceKm);
    }
}
