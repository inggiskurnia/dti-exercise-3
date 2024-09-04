import java.util.Scanner;

public class Annagram {
    public static void anagram() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the first word");
        String word1 = myObj.nextLine();

        System.out.println("Input the second word");
        String word2 = myObj.nextLine();
        boolean annagram = false;

        if (word1.length() != word2.length()){
            annagram = false;
        } else {
            for(int i=0; i<word1.length(); i++){
                for(int x=0; x<word2.length(); x++){
                    if (word1.charAt(i) == word2.charAt(x)){
                        annagram = true;
                    }
                }
            }
        }

        System.out.println("Those two words is annagram : " + annagram);
    }
}
