package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car Benz = new Car();
        Benz.make = 2014;
        Benz.Color = "Black";
        Benz.transmission = "Manual";

        Benz.displayCharacteristics();
        Benz.accelarate();
        Benz.brake();
    }
}
