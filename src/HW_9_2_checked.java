import java.util.Scanner;

public class HW_9_2_checked {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма вклада: ");
        int amount = scanner.nextInt();
        System.out.println("Годовой %: ");
        double yearlyPercent = scanner.nextDouble();
        System.out.println("Срок: ");
        int termin = scanner.nextInt();

        for (int i = 0; i < termin ; i++) {
            amount = amount + (int)(amount*(yearlyPercent/100));
        }
        System.out.printf("Через %d лет вклад будет %d EUR", termin, amount);






    }
}
