import java.util.*;

class Shape {
    String id;
    double x;
    double y;


    public Shape() {
        this.id = generateId();
        this.x = 0.0;
        this.y = 0.0;
    }

    private String generateId() {
        return UUID.randomUUID().toString().substring(0, 3);
    }

    public void move(double x_value, double y_value) {
        this.x += x_value;
        this.y += y_value;
        System.out.println("Фигура с ID " + id + " перемещена на (" + x + ", " + y + ")");
    }
}