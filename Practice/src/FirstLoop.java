import java.util.Scanner;

public class FirstLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("It will be my first loop try");

        String text = scanner.nextLine();
        System.out.println("Enter your name");

        int number = scanner.nextInt();
        System.out.println("Enter your number");

        if (number < 0) {
            System.out.println("Error ,the number is must be greater or equal to zero");
            return;
        }

        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
        scanner.close();
        }
    }


