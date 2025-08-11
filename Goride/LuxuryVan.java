public class LuxuryVan extends Ride {

    public LuxuryVan(double distance) {
        super(distance);
    }

    public double calculateFare() {
        return distance * 20;
    }
}
