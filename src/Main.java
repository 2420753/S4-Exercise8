import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-----------Welcome to the multiplication program!-----------");
        System.out.print("Enter a number: ");
        int userInput = stdin.nextInt();

        System.out.print("Enter a number to be multiplied by: ");
        int multiplier = stdin.nextInt();

        for (int i = 1; i <= multiplier; i++) {
            int result = userInput * i;
            System.out.print(i + " x " + userInput + " = " + result + "\n");
        }
    }
}