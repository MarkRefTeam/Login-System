import java.util.Scanner;

public class NameCard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); //We can pull here more one line!

        System.out.println("Enter your e-mail:");
        String email = scanner.nextLine();

        System.out.println("Enter your phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter your social media profile:");
        String social = scanner.nextLine();

        System.out.println("Enter extra information:");
        String extra = scanner.nextLine();

        System.out.println("+--------------------------------+");
        System.out.printf("| Name: %-23s |\n", name);
        System.out.printf("| Age: %-23d |\n", age);
        System.out.printf("| E-mail: %-23s |\n", email);
        System.out.printf("| Phone: %-23s |\n", phone);
        System.out.printf("| Social: %-23s |\n", social);
        System.out.printf("| Extra: %-23s |\n", extra);
        System.out.println("+--------------------------------+");

        scanner.close();
    }
}

