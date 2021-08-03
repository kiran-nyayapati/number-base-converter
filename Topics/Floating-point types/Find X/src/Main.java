import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valueA = scanner.nextDouble();
        double valueB = scanner.nextDouble();
        double valueC = scanner.nextDouble();
        
        double expression = (valueC - valueB) / valueA;
        
        System.out.println(expression);
    }
}
