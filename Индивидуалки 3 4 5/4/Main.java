public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 8);
        Pentagon pentagon = new Pentagon(3);

        triangle.move(6.0, 1.9);
        pentagon.move(2.0, 3.0);

        Shape.compare(triangle, pentagon);
    }
}