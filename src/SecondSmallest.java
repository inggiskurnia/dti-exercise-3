import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void findIt(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input length of the array");
        int numbers = myObj.nextInt();
        int[] numbersArray = new int[numbers];

        for (int i=0; i<numbers; i++) {
            System.out.println("Input number");
            numbersArray[i] = myObj.nextInt();
        }
        System.out.println("Your array number is " + Arrays.toString(numbersArray));

        Arrays.sort(numbersArray);
        System.out.println("The second smalles number in array is : " + numbersArray[1]);
    }
}
