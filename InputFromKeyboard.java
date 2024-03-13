import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String strName = keyboardScanner.nextLine();
        System.out.println("How old r u: ");
        int age = keyboardScanner.nextInt();
        System.out.println("How tall r u:");
        double height = keyboardScanner.nextDouble();
        System.out.println("mr/mrs " + strName + " height " + height + " age " + age);
        System.exit(0);
    }

}