public class Car extends BaseAbstract implements CarInterface {
    private String name;
    private String color;
    public int year;

    Car() {
        this.name = "Mercedes";
        this.color = "Red";
        this.year = 2018;
        this.setSurName("Kowalska");
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

    @Override
    public String InfoCar() {
        return "Name: " + this.name + ", " +
                "Color: " + this.color + ", " +
                "Year: " + this.year + ", " +
                "SurName: " + this.getSurName();
    }

    @Override
    public String InfoPerson() {
        return "";
    }
}
