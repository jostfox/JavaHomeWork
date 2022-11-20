import java.util.Scanner;

public class JavaHWEightLOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int repeatTimes = scanner.nextInt();
        String myString = "Я начинаю разбираться с циклами...";
        int startCycle = 0;
        while (startCycle < repeatTimes){
            startCycle++;
            System.out.println(myString);
        }
    }
}
