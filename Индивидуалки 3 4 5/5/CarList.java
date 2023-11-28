import java.util.ArrayList;
import java.util.Comparator;

public class CarList {
    ArrayList<Car> list;

    CarList(ArrayList<Car> list) {
        this.list = list;
    }

    void print() {
        System.out.println("Информация о всех автомобилях: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("----- "+ (i+1) +" -----");
            System.out.println(list.get(i).toString());
        }
    }
    void print(ArrayList <Car> anyList)
    {
        for (int i = 0; i < anyList.size(); i++) {
            System.out.println("----- "+ (i+1) +" -----");
            System.out.println(anyList.get(i).toString());
        }
    }

    int averageValueByMileage()
    {

        int sumMileage = 0;

        for (int i = 0; i < list.size(); i++) {
            sumMileage += list.get(i).getMileage();
        }

        return sumMileage / list.size();
    }

    Comparator <Car> c = new Comparator<Car>() {
        public int compare(Car c1, Car c2) {
            return c1.getBrand().compareTo(c2.getBrand());
        }
    };

    void printByMileageAndBrand()
    {
        System.out.println("Информация об отсортированных по пробегу автомобилях: ");
        ArrayList <Car> correct_list = new ArrayList<>();
        for(int i = 0; i < list.size(); i++)
        {
            if (list.get(i).mileage <= averageValueByMileage())
                correct_list.add(list.get(i));
        }
        correct_list.sort(c);
        print(correct_list);
    }


}
