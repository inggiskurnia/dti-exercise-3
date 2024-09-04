import java.util.Arrays;
import java.util.Scanner;

public class FIbbonaci {
    public static void findFibo(){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Input how many sequence : ");
        int sequence = myObj.nextInt();

        int a = 0;
        int b = 1;
        int next = b;
        int[] result = new int[sequence];
        result[0] = a;
        result[1] = b;

        for (int i=0; i<sequence-2; i++){

            next = a + b;
            a = b;
            b = next;

            result[i+2] = next;
        }

        System.out.println(Arrays.toString(result));
    }
}
