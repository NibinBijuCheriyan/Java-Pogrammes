public class Bike extends Ride {

    public Bike(double distance) {
        super(distance);
    }

    
    public double calculateFare() {
        return distance * 5;
    }
}
