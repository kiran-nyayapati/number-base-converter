import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valueOne = scanner.nextDouble();
        double valueTwo = scanner.nextDouble();
        
        double difference = valueTwo - valueOne;
        
        System.out.println(difference);
    }
}
