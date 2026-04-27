public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
    @Override
    public String getVehicleName(){
        return "Car";
    }
}
