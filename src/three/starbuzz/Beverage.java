package three.starbuzz;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;
    protected String description = "Unknown beverages";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();

}
