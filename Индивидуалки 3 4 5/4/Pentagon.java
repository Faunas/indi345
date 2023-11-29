// Класс для пятиугольников
class Pentagon extends Shape<Pentagon> {
    double a;

    public Pentagon(double a) {
        this.a = a;
    }

    // Переопределение метода для вычисления площади пятиугольника
    public double calculateArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(a, 2);
    }
}