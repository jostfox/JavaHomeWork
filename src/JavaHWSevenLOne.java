import java.util.Scanner;

public class JavaHWSevenLOne {
    public static void main(String[] args) {

        // Level 1.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String myString = scanner.nextLine();
        int myStringLength = myString.length();
        System.out.println(myStringLength > 10);

        //Level 1.2
        System.out.println("Введите еще что-нибудь: ");
        String myNewString = scanner.nextLine();
        char firstChar = myNewString.charAt(0);
        char lastChar = myNewString.charAt(myNewString.length() - 1);
        System.out.println(firstChar == lastChar);
    }
}
