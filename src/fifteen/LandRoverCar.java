package fifteen;

public class LandRoverCar extends AbstractCar {
    @Override
    public void run() {
        gear.gear();
        System.out.println("LandRoverCar is running");
    }
}
