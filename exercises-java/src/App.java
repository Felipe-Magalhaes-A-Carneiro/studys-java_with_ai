import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        var name = scanner.next();

        System.out.printf("All right, %2. Now tell us you age: ", name);
        var age = scanner.nextInt();

        System.out.printf("Nice to meet you, %2. You are %2 years old.", name, age);
        
        scanner.close();
    }
}
