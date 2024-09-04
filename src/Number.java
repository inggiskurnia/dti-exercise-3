import java.util.Scanner;

public class Number {

    public static void findTotal () {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input some number to be added");

        int number = myObj.nextInt();
        int length = String.valueOf(number).length();
        int result = 0;

        for (int i=0; i<length; i++ ) {
            String a = String.valueOf(String.valueOf(number).charAt(i));
            result += Integer.valueOf(a);
        }

        System.out.println("The total value of the number is " + result);
    }

}
