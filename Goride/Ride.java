// Abstract superclass
public abstract class Ride {
    protected double distance; 

    public Ride(double distance) {
        this.distance = distance;
    }
    public abstract double calculateFare();
}
