import java.util.Scanner;

public class JavaHWSevenLTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String stringAB = scanner.nextLine();
        stringAB = stringAB.toUpperCase();
        System.out.println(stringAB);
        stringAB = stringAB.replace('A', '.');
        stringAB = stringAB.replace('B', 'A');
        stringAB = stringAB.replace('.', 'B');
        System.out.println(stringAB);

    }
}
