public class Car {
    private String name;
    private String color;
    private int year;

    Car() {
        this.name = "Mercedes";
        this.color = "red";
        this.year = 2018;
    }

    Car(String color) {
        this.name = "Mercedes";
        this.color = color;
        this.year = 2018;
    }

    Car(String color, int year) {
        this.name = "Mercedes";
        this.color = color;
        this.year = year;
    }

    public String InfoCar() {
        return "Name: " + name + ", " +
                "Color: " + color + ", " +
                "Year: " + year;
    }
}
