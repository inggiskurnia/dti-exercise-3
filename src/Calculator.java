import java.util.Scanner;

public class Calculator {
    public static void calc() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Input your first number");
        int num1 = myObj.nextInt();

        System.out.println("Input your operator");
        myObj.nextLine();
        String oper = myObj.nextLine();

        System.out.println("Input you second number");
        int num2 = myObj.nextInt();
        
        int result = 0;
        switch(oper){
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;
        }

        System.out.println("The result is : " + result);
    }
}
