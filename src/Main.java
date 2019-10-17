public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        Car c1 = new Car("Jess");
        lot.run(c1);
        lot.printRevenue();
        lot.printOpenSpots();
    }
}
