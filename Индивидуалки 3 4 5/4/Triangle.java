// Класс для треугольников
class Triangle extends Shape<Triangle> {
    double a;
    double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Переопределение метода для вычисления площади треугольника

    public double calculateArea() {
        return 0.5 * a * b;
    }
}