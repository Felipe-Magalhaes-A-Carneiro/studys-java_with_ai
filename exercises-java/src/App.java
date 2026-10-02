import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find out the age difference between two people. ");
        
        System.out.println("Step 1 - Enter the first person's name: ");
        var name1 = scanner.next();
        System.out.printf("Step 2 - Enter %s's age: ", name1);
        var age1 = scanner.nextInt();

        System.out.println("Step 3 - Enter the second person's name: ");
        var name2 = scanner.next();
        System.out.printf("Step 4 - Enter %s's age: ", name2);
        var age2 = scanner.nextInt();
        

        var diference = age1 - age2;

        System.out.printf("The age difference between %s (%s years old) and %s (%s years old) is %s years. ", name1, age1, name2, age2, diference);

        scanner.close();
    }
}
