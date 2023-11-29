import java.util.UUID;

// Базовый класс для всех объектов
class Shape<T> {
    String id;
    double x;
    double y;

    public Shape() {
        // Генерируем произвольный идентификатор
        this.id = generateId();
        this.x = 0.0;
        this.y = 0.0;
    }

    // Генерация произвольного идентификатора
    String generateId() {
        return UUID.randomUUID().toString().substring(0, 3);
    }

    // Метод для перемещения объекта
    public void move(double x_value, double y_value) {
        this.x += x_value;
        this.y += y_value;
        System.out.println("Фигура с ID " + id + " перемещена на (" + x + ", " + y + ")");
    }

    // Метод для сравнения объектов по площади
    public static <T extends Shape<?>> void compare(T shape1, T shape2) {
        double area1 = shape1.calculateArea();
        double area2 = shape2.calculateArea();

        System.out.println("Сравниваемые фигры:");
        System.out.println("Фигура " + shape1.getClass().getSimpleName() + " с ID " + shape1.id + " Площадь фигуры: " + area1);
        System.out.println("Фигура " + shape2.getClass().getSimpleName() + " с ID " + shape2.id + " Площадь фигуры: " + area2);

        if (area1 > area2) {
            System.out.println("Треугольник имеет большую площадь.");
        } else if (area1 < area2) {
            System.out.println("Пятиугольник имеет большую площадь.");
        } else {
            System.out.println("Площади равны");
        }
    }

    // Метод для вычисления площади. Перезаписываем её в конкретных классах.
    public double calculateArea() {
        return 0.0;
    }
}