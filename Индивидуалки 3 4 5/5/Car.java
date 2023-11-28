public class Car
{
    String number;
    String brand;
    int mileage;
    int price;
    int year;
    int engineCapacity;

    Car(String number, String brand, int mileage, int price, int year, int engineCapacity)
    {
        this.number=number;
        this.brand=brand;
        this.mileage=mileage;
        this.price=price;
        this.year=year;
        this.engineCapacity=engineCapacity;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String toString()
    {
        return "Номер: " + number + "\nБрэнд: " + brand + "\nПробег: " + mileage +
                "\nЦена: " + price + "\nГод выпуска: " + year + "\nОбъём двигателя: " + engineCapacity;
    }
}
