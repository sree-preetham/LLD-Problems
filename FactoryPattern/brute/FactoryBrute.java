import java.util.Scanner;

public class FactoryBrute {
    public static void main(String[] args){
        System.out.println("Factory method brute code");
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();
        if(vehicleType.equals("car")){
            Car car = new Car();
            car.start();
            System.out.println("Vehicle name is " + car.getVehicleName());
        }
        else if(vehicleType.equals("bike")){
            Bike bike = new Bike();
            bike.start();
            System.out.println("Vehicle name is " + bike.getVehicleName());
        }
        else if(vehicleType.equals("truck")){
            Truck truck = new Truck();
            truck.start();
            System.out.println("Vehicle name is " + truck.getVehicleName());
        }
    }
}
