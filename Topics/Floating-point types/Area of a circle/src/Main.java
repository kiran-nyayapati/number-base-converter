import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radiusOfACircle = scanner.nextDouble();
        double areaOfACircle = Math.PI * radiusOfACircle * radiusOfACircle;
        
        System.out.println(areaOfACircle);
    }
}
