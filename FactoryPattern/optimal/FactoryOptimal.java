import java.util.Scanner;

public class FactoryOptimal {
    public static void main(String[] args){
        System.out.println("Factory method optimal code");
        Scanner scanner = new Scanner(System.in);

        String vehicleType = scanner.nextLine();
        Vehicle vehicle1 = VehicleFactory.createVehicle(vehicleType);
        vehicle1.start();
        System.out.println("Vehicle name is " + vehicle1.getVehicleName());

        vehicleType = scanner.nextLine();
        Vehicle vehicle2 = VehicleFactory.createVehicle(vehicleType);
        vehicle2.start();
        System.out.println("Vehicle name is " + vehicle2.getVehicleName());

        vehicleType = scanner.nextLine();
        Vehicle vehicle3 = VehicleFactory.createVehicle(vehicleType);
        vehicle3.start();
        System.out.println("Vehicle name is " + vehicle3.getVehicleName());
    }
}
