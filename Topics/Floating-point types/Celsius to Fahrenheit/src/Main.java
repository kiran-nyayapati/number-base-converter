import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double degreeCelsius = scanner.nextDouble();      
        double degreeFahrenheit = degreeCelsius * 1.8 + 32;
        
        System.out.println(degreeFahrenheit);
    }
}
