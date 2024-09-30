package BasicQuestion;

class _12per {
    public static void main(String[] args) {
        double hypotenuse = 13.0;
        double side = 12.0;
        double sideB = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side, 2));
        double area = (1.0 / 2) * side * sideB;
        System.out.printf("The length of the other side is:", sideB);
        System.out.printf("The area of the right-angled triangle is:", area);
    }
}
