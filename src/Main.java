public class Main {
    public static void main(String[] args) {

//        LEVEL 1

        Person personOne = new Person();
        Person personTwo = new Person("Ivan Ivanov", 35);

        personOne.move();
        personOne.talk();

        personTwo.move();
        personTwo.talk();

        //    LEVEL 2

        System.out.println("____________________");
        Phone phoneOne = new Phone("49684545678", "Samsung", 218.5);
        Phone phoneTwo = new Phone("49658435484", "Xiaomi", 219.9);
        Phone phoneThree = new Phone("380965876584", "Iphone", 308.7);

        System.out.println("First phone: \n" +
                "Number: " + phoneOne.number + "\n" +
                "Model: " + phoneOne.model + "\n" +
                "Weight: " + phoneOne.weight);

        System.out.println("\nSecond phone: \n" +
                "Number: " + phoneTwo.number + "\n" +
                "Model: " + phoneTwo.model + "\n" +
                "Weight: " + phoneTwo.weight);

        System.out.println("\nThird phone: \n" +
                "Number: " + phoneThree.number + "\n" +
                "Model: " + phoneThree.model + "\n" +
                "Weight: " + phoneThree.weight);

        phoneOne.receiveCall("Alexandra");
        System.out.println(phoneOne.getNumber());

        phoneTwo.receiveCall("Helmut");
        System.out.println(phoneTwo.getNumber());

        phoneThree.receiveCall("Irina");
        System.out.println(phoneThree.getNumber());

    }




}
