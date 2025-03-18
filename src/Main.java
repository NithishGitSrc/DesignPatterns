
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a Design Pattern to run:");
/*

        System.out.println("1. Singleton");
        System.out.println("2. Factory");
        System.out.println("3. Adapter");
        System.out.println("4. Observer");
//        Add more patterns as needed
*/

        int choice = scanner.nextInt();

/*
        switch (choice) {
            case 1:
                SingletonExample.main(args);
                break;
            case 2:
                FactoryExample.main(args);
                break;
            // Add more cases
            default:
                System.out.println("Invalid choice.");
        }
*/

        scanner.close();
    }
}