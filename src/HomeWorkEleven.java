import java.util.Scanner;

public class HomeWorkEleven {

    public static void main(String[] args) {

        greeting();
    }

    public static int numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number: ");
        int numberVariable = scanner.nextInt();
        return numberVariable;
    }

    public static int firstDigit(int var) {
        return var / 100;
    }

    public static int secondDigit(int var) {
        return (var / 10) % 10;
    }

    public static int thirdDigit(int var) {
        return var % 10;
    }

    public static void greeting(){
        int threeDigitNumber = numbers();
        System.out.println("The first digit is: " + firstDigit(threeDigitNumber));
        System.out.println("The second digit is: " + secondDigit(threeDigitNumber));
        System.out.println("The third digit is: " + thirdDigit(threeDigitNumber));
    }
}
