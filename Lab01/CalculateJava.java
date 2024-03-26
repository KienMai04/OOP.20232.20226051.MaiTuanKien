import javax.swing.JOptionPane;

public class CalculateJava {
    public static void main(String[] args) {
        String strNum1, strNum2;

        String notificationString = "You've just entered ";
        strNum1 = JOptionPane.showInputDialog(null, "Enter the first number", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Enter the second number", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum2 + " .";
        double num1, num2;
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        JOptionPane.showMessageDialog(null, notificationString, "Calculate", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Sum = " + sum + "\nDifference = " + difference + "\nProduct = " + product + "\nQuotient = " + quotient,
                "Calculate", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}