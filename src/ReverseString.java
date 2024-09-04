import java.util.Scanner;

public class ReverseString {
    public static void reverse(){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Input your word : ");
        String words = myObj.nextLine();

        int length = words.length();
        StringBuilder reverse = new StringBuilder();

        for (int i=0; i<length; i++){
            reverse.append(words.charAt(length-i-1));
        }

        System.out.print("The reverse word is " + reverse);
    }
}
