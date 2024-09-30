package BasicQuestion;

class Rectangle {
    public static void main(String[] args) {

        int p = 230;
        int length = 70;

        int breadth = (p / 2) - length;

        int area = length * breadth;

        System.out.println("The breadth of the rectangle is: " + breadth);
        System.out.println("The area of the rectangle is: " + area);
    }
}
