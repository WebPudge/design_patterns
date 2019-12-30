package fifteen;

public class BenZCar extends AbstractCar {
    @Override
    public void run() {
        gear.gear();
        System.out.println("BenZCar is running");
    }
}
