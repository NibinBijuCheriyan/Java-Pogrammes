public class Car extends Ride {

    public Car(double distance) {
        super(distance);
    }

    public double calculateFare() {
        return distance * 10;
    }
}
