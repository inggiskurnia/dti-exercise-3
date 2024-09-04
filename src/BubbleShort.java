import java.util.Arrays;
import java.util.Scanner;

public class BubbleShort {
    public static void findOrder(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input length of the array");
        int numbers = myObj.nextInt();
        int[] numbersArray = new int[numbers];

        for (int i=0; i<numbers; i++) {
            System.out.println("Input number");
            numbersArray[i] = myObj.nextInt();
        }
        System.out.println("Your array number is " + Arrays.toString(numbersArray));

        for(int i=0; i<numbers-1; i++) {

            int a = numbersArray[i];
            int b = numbersArray[i+1];

            if(numbersArray[i] > numbersArray[i+1]){
                numbersArray[i] = b;
                numbersArray[i+1] = a;
            }
        }

        System.out.println("Your sorted array is : " + Arrays.toString(numbersArray));
    }
}
