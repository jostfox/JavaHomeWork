import java.util.Arrays;

public class App {


    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Smartphone Xiaomi");
        smartPhone.call("+494589651245");
        smartPhone.receiveCall("+491515324987");
        System.out.println();

        SatellitePhone satellitePhone = new SatellitePhone("Icom");
        satellitePhone.call("+125895483597");
        satellitePhone.receiveCall("+578972158743");
        System.out.println();

        HomePhone telecom = new HomePhone("Telecom");
        telecom.call("+499565479325");
        telecom.receiveCall("+496254985145");
        makeCall(smartPhone);
        receiveCall(satellitePhone);
        System.out.println();
        Phone phone = new Phone();
        phone.receiveCallArray(new SmartPhone("fg"), new SatellitePhone("hg"), new HomePhone("jr"));
        phone.makeCallArray(new SmartPhone("df"), new SatellitePhone("rt"), new HomePhone("vb"));



    }


    public static void makeCall(Phone phone) {
        String number = phone.outGoingNumber;
        System.out.println("\n" + phone + " calling to " + number);
    }

    public static void receiveCall(Phone phone) {
        String number = phone.incomingNumber;
        System.out.println("\n" + phone + " calling to " + number);
    }


}




