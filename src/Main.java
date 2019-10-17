public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        Car c1 = new Car("Jess");
        Car c2 = new Car("Alex");
        lot.run(c1);
        lot.run(c2);
        lot.printRevenue();
        lot.printOpenSpots();
    }
}
