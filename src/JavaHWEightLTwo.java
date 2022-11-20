import java.util.Scanner;

public class JavaHWEightLTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь: ");
        String myString = scanner.nextLine();
        char firstLetter = myString.charAt(0);
        int stringLength = myString.length();
        int repeatChar = 0;
        while (repeatChar < stringLength){
            repeatChar++;
            System.out.println(firstLetter);
        }
    }
}
