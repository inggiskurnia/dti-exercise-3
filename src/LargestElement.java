import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    public static void findLargest() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input length of the array");
        int numbers = myObj.nextInt();
        int[] numbersArray = new int[numbers];

        for (int i=0; i<numbers; i++) {
            System.out.println("Input number");
            numbersArray[i] = myObj.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(numbersArray));

        int max = numbersArray[0];
        for (int i=0; i<numbers; i++) {
            if (numbersArray[i] > max) {
                max = numbersArray[i];
            }
        }

        System.out.println("The largest number is " + max);

    }
}
