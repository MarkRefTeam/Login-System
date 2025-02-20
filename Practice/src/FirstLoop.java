import java.util.Scanner;

public class FirstLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("It will be my first loop try");

        System.out.println("Enter your name");
        String text = scanner.nextLine();

        System.out.println("Enter your number");
        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println("Error ,the number is must be greater or equal to zero");
            return; ///Exits the program if input is invalid
        }

        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
        scanner.close();
    }
}


