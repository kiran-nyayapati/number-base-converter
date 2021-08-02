import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double distanceInMiles = scanner.nextDouble();
        double travelTimeByBus = scanner.nextDouble();
        
        double averageSpeed = distanceInMiles / travelTimeByBus;
        
        System.out.println(averageSpeed);
    }
}
