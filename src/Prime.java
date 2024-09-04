import java.util.Scanner;

public class Prime {
    public static void checkPrime () {

        boolean isPrime = false;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input some number to be checked as prime");
        int number = myObj.nextInt();

        if (number <= 1) {
            isPrime = false;
        }

        for (int i=2; i<number; i++) {
            isPrime = (number % i) != 0;
        }
        System.out.println("The number is prime : " + isPrime);
    }
}
