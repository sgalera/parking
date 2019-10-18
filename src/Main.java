public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Jess", "10:00");
        Car c2 = new Car("Alex", "12:00");
        ParkingLot lot = new ParkingLot();
        lot.entering(c1);
        lot.entering(c2);
        lot.leaving(c1.name);
        lot.leaving(c2.name);

    }
}
