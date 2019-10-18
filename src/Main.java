import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File text = null;
        Car car = null;
        ParkingLot parkingLot = new ParkingLot();
        String line = null;
        String name = null;
        String time = null;
        String choice = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Text file: ");
        text = new File(input.next());

        Scanner fileScanner = new Scanner(text);
        while(fileScanner.hasNextLine()) {
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            name = lineScanner.next();
            time = lineScanner.next();
            choice = lineScanner.next();
            if(choice.equals("enter")) {
                car = new Car(name, time);
                parkingLot.entering(car);
            }
            else if(choice.equals("exit")) {
                parkingLot.leaving(name);
            }
            lineScanner.close();
        }
        fileScanner.close();

        parkingLot.printRevenue();
    }
}
