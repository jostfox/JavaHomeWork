public class SmartPhone extends Phone {
    private String phoneType;

    public SmartPhone(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public void call(String outGoingNumber) {
        super.outGoingNumber = outGoingNumber;
        System.out.println(phoneType + " is calling to " + outGoingNumber);
    }

    @Override
    public void receiveCall(String incomingNumber) {
        super.incomingNumber = incomingNumber;
        System.out.println("Smartphone is receiving call from " + incomingNumber);
    }

    @Override
    public String toString() {
        return "SmartPhone";
    }


}
