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

        boolean swapped;

        for(int i=0; i<numbers-1; i++) {
            swapped = false;

            for (int j=0; j<numbers-1; j++) {

                if(numbersArray[j] > numbersArray[j+1]){

                    //temp variable
                    int a = numbersArray[j];
                    int b = numbersArray[j+1];

                    numbersArray[j] = b;
                    numbersArray[j+1] = a;
                    swapped = true;
                }
            }
        if (!swapped) {
            break;
        }
        }

        System.out.println("Your sorted array is : " + Arrays.toString(numbersArray));
    }
}
