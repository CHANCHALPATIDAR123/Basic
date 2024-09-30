package BasicQuestion;

public class _24per {
    public static void main(String[] args) {
        double length = 5.0;
        double width = 4.0;
        double pricePerSquareMeter = 205.0;
        double area = length * width;
        double totalPrice = area * pricePerSquareMeter;
        System.out.printf("The price:" + totalPrice);
    }
}
