package BasicQuestion;

class Area {
    public static void main(String[] args) {

        int area = 96;
        int breadth = 8;

        int length = area / breadth;

        int p = 2 * (length + breadth);

        // Print the results
        System.out.println("The length of the rectangle is: " + length);
        System.out.println("The perimeter of the rectangle is: " + p);
    }
}
