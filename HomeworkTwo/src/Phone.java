import java.util.Scanner;

public class Phone {

    protected String incomingNumber;
    protected String outGoingNumber;

    public void call(String outGoingNumber) {
        System.out.println(" calling to " + outGoingNumber);
    }

    public void receiveCall(String incomingNumber) {
        System.out.println(" incoming call from " + incomingNumber);
    }

    public void receiveCallArray(Phone phoneOne, Phone phoneTwo, Phone phoneTree) {
        System.out.println("Input the number: \n");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        Phone[] phoneArray = new Phone[]{phoneOne, phoneTwo, phoneTree};
        for (Phone phoneList : phoneArray) {
            System.out.println(number + "is calling to " + phoneList);
        }
    }

    public void makeCallArray(Phone phoneOne, Phone phoneTwo, Phone phoneTree) {
        System.out.println("Input the number: \n");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        Phone[] phoneArray = new Phone[]{phoneOne, phoneTwo, phoneTree};
        for (Phone phoneList : phoneArray) {
            System.out.println(phoneList + " is calling to " + number);
        }
    }
}



