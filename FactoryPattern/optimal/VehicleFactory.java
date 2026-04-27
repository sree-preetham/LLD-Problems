public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType){
        if (vehicleType.equals("car")) {
            return new Car();
        } else if (vehicleType.equals("truck")) {
            return new Truck();
        } else if (vehicleType.equals("bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
