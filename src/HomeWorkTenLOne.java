import java.util.Arrays;

public class HomeWorkTenLOne {

    public static void main(String[] args) {

        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 10;
        }
        System.out.println(Arrays.toString(myArray));
        myArray[0] = 0;
        myArray[98] = 0;
        System.out.println(Arrays.toString(myArray));

    }
}
