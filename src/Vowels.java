import java.util.Scanner;

public class Vowels {
    public static void findVowels() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input your word : ");
        String word = myObj.nextLine();
        int length = word.length();
        int count = 0;

        for (int i=0; i<length; i++) {
            if (word.charAt(i) == 'a' ||
            word.charAt(i) == 'i' ||
            word.charAt(i) == 'u' ||
            word.charAt(i) == 'e' ||
            word.charAt(i) == 'o'
            ) {
                count += 1;
            }
        }

        System.out.println("The number of vowels is : " + count);


    }
}
