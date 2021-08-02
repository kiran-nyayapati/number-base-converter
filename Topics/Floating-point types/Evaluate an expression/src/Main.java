import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double doubleValueA = scanner.nextDouble();
        double doubleValueB = scanner.nextDouble();
        double doubleValueC = scanner.nextDouble();
        double doubleValueD = scanner.nextDouble();
        
        double evaluatedResult = doubleValueA * 10.5 + doubleValueB * 4.4 + (doubleValueC + doubleValueD) / 2.2;
        
        System.out.println(evaluatedResult);
    }
}
