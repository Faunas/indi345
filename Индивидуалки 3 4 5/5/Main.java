import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> a = new ArrayList<>();
        a.add(new Car("Y111BV", "BMW", 900, 1200000, 2003, 30));
        a.add(new Car("X222CD", "Mercedes", 800, 1500000, 2005, 35));
        a.add(new Car("W333DE", "Audi", 1000, 1000000, 2008, 25));
        a.add(new Car("V444EF", "Toyota", 700, 800000, 2010, 28));
        a.add(new Car("E555FG", "Honda", 1200, 1100000, 2012, 32));
        a.add(new Car("F666GH", "Ford", 200, 900000, 2014, 27));
        a.add(new Car("G777HI", "Chevrolet", 1500, 1300000, 2016, 30));
        a.add(new Car("H888IJ", "Nissan", 500, 700000, 2018, 26));
        a.add(new Car("I999JK", "Volkswagen", 1100, 1200000, 2020, 31));
        a.add(new Car("J1010KL", "Hyundai", 800, 950000, 2015, 29));
        a.add(new Car("K1111LM", "Kia", 1000, 1000000, 2013, 33));
        a.add(new Car("L1212MN", "Mazda", 300, 850000, 2011, 28));
        a.add(new Car("M1313NO", "Subaru", 900, 1100000, 2019, 30));
        a.add(new Car("N1414OP", "Lexus", 1200, 1400000, 2017, 34));
        a.add(new Car("O1515PQ", "Infiniti", 600, 800000, 2009, 26));
        a.add(new Car("P1616QR", "Jaguar", 1300, 1600000, 2018, 32));
        a.add(new Car("Q1717RS", "Porsche", 700, 900000, 2012, 29));
        a.add(new Car("R1818ST", "Ferrari", 1000, 2000000, 2014, 31));
        a.add(new Car("S1919TU", "Lamborghini", 800, 1800000, 2016, 30));
        a.add(new Car("T2020UV", "Tesla", 900, 1500000, 2021, 35));
        a.add(new Car("U2121VW", "Rolls-Royce", 600, 2500000, 2013, 28));
        a.add(new Car("V2222WX", "Bentley", 1100, 2200000, 2015, 33));
        a.add(new Car("W2323XY", "Bugatti", 1200, 3000000, 2017, 36));
        a.add(new Car("X2424YZ", "McLaren", 50, 2800000, 2019, 29));
        a.add(new Car("Y2525ZA", "Aston Martin", 800, 2600000, 2022, 30));
        CarList list = new CarList(a);
        list.print();
        int avg_value = list.averageValueByMileage();
        System.out.println("Среднее значение объема двигателя среди всех авто: " + avg_value);
        list.printByMileageAndBrand();


    }
}