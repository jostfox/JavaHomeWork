import java.util.Scanner;

public class HW_9_1_checked {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число, не меньшее 2: ");
        int number = scanner.nextInt();

        for (int i = number; i > 2; i--) {
            if (number % i == 0 && i != number) {
                System.out.println(i);
                break;

            }

        }
    }
}
