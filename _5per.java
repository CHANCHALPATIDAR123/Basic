package BasicQuestion;

class _5per {
    public static void main(String[] args) {
        double cost = 1600.0;
        double rate = 25.0;
        double length = 20.0;

        double totalLength = cost / rate;
        double perimeter = totalLength;
        double breadth = (perimeter / 2) - length;
        double area = length * breadth;
        System.out.printf("Breadth" + breadth);
        System.out.printf("Perimeter " + totalLength);
        System.out.printf("Area of the park:" + area);
    }
}
