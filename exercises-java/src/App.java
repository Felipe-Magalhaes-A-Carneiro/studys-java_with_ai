import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the area of a triangle. We will multiply the base measurement by the height measurement. ");
        
        System.out.println("First, enter the base of your triangle. ");
        var base = scanner.nextDouble(); 
        
        System.out.println("Now, enter the height (m): ");
        var height = scanner.nextDouble();

        var area  = base * height;

        System.out.printf("Area details: Base -> %s. Height -> %s. The area of your triangle is %s(m²).", base, height, area);

        scanner.close();
    }
}