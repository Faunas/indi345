class Pentagon extends Shape {
    double side;

    public Pentagon(double side) {
        this.side = side;
    }

    // Вычисление площади пятиугольника
    public double calculateArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(side, 2);
    }
}