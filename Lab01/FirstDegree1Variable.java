import javax.swing.JOptionPane;

public class FirstDegree1Variable {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String notificationString = "You've just entered ";
        strNum1 = JOptionPane.showInputDialog(null, "please enter a", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "please enter b", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum2 + " .";
        double num1, num2;
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        double x = (0 - num2) / num1;
        JOptionPane.showMessageDialog(null, notificationString + "\nX = " + x, "First Degree 1 Variable",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}