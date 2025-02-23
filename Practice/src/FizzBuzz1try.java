import java.util.Scanner;

public class FizzBuzz1try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Please enter a number (greater than 0): ");
            number = scanner.nextInt();
        } while (number < 1);

        for (int i = 1; i <= number; i++)
            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        scanner.close();
    }
}


