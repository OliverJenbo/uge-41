package Task_1;

public class Car {
private String brand;
private String model;
private int year;
private String type;
private String driver;



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }

    public Car(String brand, String model, int year, String type){
    this.brand = brand;
    this.model = model;
    this. year = year;
    this.type = type;



}

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
