import java.util.Scanner;

public class RideTest {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the distance going to be travelled through bike");
		int b = sc.nextInt();
        Ride bikeRide = new Bike(b);
		System.out.println("enter the distance going to be travelled through car");
		int c = sc.nextInt();
        Ride carRide = new Car(c);
		System.out.println("enter the distance going to be travelled through van");
		int v = sc.nextInt();
        Ride vanRide = new LuxuryVan(v);

        System.out.println("Bike Fare: $" + bikeRide.calculateFare());
        System.out.println("Car Fare: $" + carRide.calculateFare());
        System.out.println("Luxury Van Fare: $" + vanRide.calculateFare());
    }
}
