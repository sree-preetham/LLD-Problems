public class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is starting");
    }
    @Override
    public String getVehicleName(){
        return "Bike";
    }
}
