package BasicQuestion;

class _6per {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 9.0;
        double perimeter = 36.0;

        double c = perimeter - (a + b);
        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("The area of the triangle is" + area);
    }
}
