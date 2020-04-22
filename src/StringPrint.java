import java.util.Scanner;

public class StringPrint {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Your name is " + name);
    }
}
