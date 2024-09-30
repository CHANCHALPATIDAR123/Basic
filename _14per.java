package BasicQuestion;

class _14per {
    public static void main(String[] args) {
        double lengthShelly = 22.0;
        double breadthShelly = 15.0;
        double areaShelly = lengthShelly * breadthShelly;

        double sideRachel = 21.0;
        double areaRachel = sideRachel * sideRachel;
        if (areaShelly > areaRachel) {
            double difference = areaShelly - areaRachel;
            System.out.printf("Shelly's garden is bigger by: %.2f m²%n", difference);
        } else if (areaRachel > areaShelly) {
            double difference = areaRachel - areaShelly;
            System.out.printf("Rachel's garden is bigger by: %.2f m²%n", difference);
        } else {
            System.out.println("Both gardens are of equal size.");
        }
    }
}
