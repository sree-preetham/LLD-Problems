public class Truck implements Vehicle{
    @Override
    public void start(){
        System.out.println("Truck is starting");
    }
    @Override
    public String getVehicleName(){
        return "Truck";
    }
}
