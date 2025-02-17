import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give a number between 1 and 12");

        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("month day 31");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month is 30");
                break;

            case 2:
                System.out.println("this month is 28/29");
                break;
            default:
                System.out.println("Wrong input");
        }


        System.out.println("thank you for use it");
        scanner.close();
    }
}