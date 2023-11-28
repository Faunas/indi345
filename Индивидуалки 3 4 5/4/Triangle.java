class Triangle extends Shape {
    double a;
    double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Вычисление площади треугольника
    public double calculateArea() {
        return 0.5 * a * b;
    }
}
