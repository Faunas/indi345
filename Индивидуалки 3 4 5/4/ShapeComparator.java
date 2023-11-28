class ShapeComparator {
    public static void compare(Triangle t, Pentagon p) {
        double areaT = t.calculateArea();
        double areaP = p.calculateArea();

        System.out.println("Сравниваемые фигуры:");
        System.out.println("Фигура треугольник с ID " + t.id + ": " + areaT);
        System.out.println("Фигура пятиугольник с ID " + p.id + ": " + areaP);

        if (areaT > areaP) {
            System.out.println("Треугольник имеет большую площадь.");
        } else if (areaT < areaP) {
            System.out.println("Пятиугольник имеет большую площадь.");
        } else {
            System.out.println("Площади равны");
        }
    }
}