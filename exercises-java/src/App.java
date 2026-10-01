import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the area in square meters. Simply multiply the length by the width in meters.");
        
        System.out.println("First, enter the length of the area (m): ");
        var length = scanner.nextDouble(); 
        
        System.out.println("Now, enter the width of the area (m): ");
        var width = scanner.nextDouble();

        var area  = length * width;

        System.out.printf("Area details: Length -> %s. Width -> %s. The area is %s(m²).", length, width, area);

        scanner.close();
    }
}
