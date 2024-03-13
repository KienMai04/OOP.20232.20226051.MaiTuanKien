import javax.swing.JOptionPane;

public class SecondDegree2Variables {
    public static void main(String[] args) {
        String strNum1, strNum2, strNum3;
        String notificationString = "You've just entered ";
        strNum1 = JOptionPane.showInputDialog(null, "please enter a", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "please enter b", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum2 + " and ";
        strNum3 = JOptionPane.showInputDialog(null, "please enter c", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum3 + ".";
        double num1, num2, num3;
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        num3 = Double.parseDouble(strNum3);
        double delta = num2 * num2 - 4 * num1 * num3;
        if (delta < 0) {
            JOptionPane.showMessageDialog(null, notificationString + "\nNo real roots", "Second Degree 2 Variables",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            double x = -num2 / (2 * num1);
            JOptionPane.showMessageDialog(null, notificationString + "\nOne real root: " + x,
                    "Second Degree 2 Variables", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta > 0) {
            double x1 = (-num2 + Math.sqrt(delta)) / (2 * num1);
            double x2 = (-num2 - Math.sqrt(delta)) / (2 * num1);
            JOptionPane.showMessageDialog(null, notificationString + "\nTwo real roots: " + x1 + " and " + x2,
                    "Second Degree 2 Variables", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}