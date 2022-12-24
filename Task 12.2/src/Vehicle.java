public class Vehicle {
    public static void main(String[] args) {
        Vehicle Ship = new Ship();
        System.out.println("Ship : ");
        Ship.InformationTransport();
        Vehicle Plane = new Plane();
        System.out.println("Plane : ");
        Plane.InformationTransport ();
        Vehicle Car = new Car();
        System.out.println("Car : ");
        Car.InformationTransport();

    }
    public void InformationTransport () {

        double Coordinates = 155.5;
        int price = 3000;
        int speed = 250;
        int year = 2001;
        System.out.println("Координати : " + Coordinates);
        System.out.println("Ціна : " + price);
        System.out.println("Швидкість : " + speed);
        System.out.println("Рік : " + year);

}
}

