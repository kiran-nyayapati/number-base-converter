import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double doubleValueX = scanner.nextDouble();
        
        double evaluatedResult = Math.pow(doubleValueX, 3) + Math.pow(doubleValueX, 2) +
                                 Math.pow(doubleValueX, 1) + 1;
        
        System.out.println(evaluatedResult);
    }
}
