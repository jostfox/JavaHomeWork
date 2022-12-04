import java.util.Arrays;

public class HomeWorkTenLTwo {

    public static void main(String[] args) {

        int[] myArray = new int[100];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (i % 10) * 111;
            sum = sum + myArray[i];
        }

        System.out.println(Arrays.toString(myArray));
        System.out.printf("Sum of array is %d", sum);

    }


}

