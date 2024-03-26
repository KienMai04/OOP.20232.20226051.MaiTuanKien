import javax.swing.JOptionPane;

public class ChoosingOptions {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to first class ticket?");
        JOptionPane.showMessageDialog(null, "you have choosen: " + (option == JOptionPane.OK_OPTION ? "Yes" : "No"));

    }
}