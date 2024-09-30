package BasicQuestion;

class _11per {
    public static void main(String[] args) {
        double area = 320.0;
        double Base = 8.0;
        double Height = 5.0;
        double x = Math.sqrt((2 * area) / (Base * Height));
        double base = Base * x;
        double height = Height * x;
        System.out.printf("Base:" + base, height);
    }
}
