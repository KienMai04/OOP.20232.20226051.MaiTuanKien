import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("The Month: ");
        String month = scanner.nextLine();
        System.out.println("The Year: ");
        int year = scanner.nextInt();
        switch (month) {
            case "January", "Jan.", "Jan", "1", "March", "Mar.", "Mar", "3", "May", "5", "July", "Jul.", "Jul", "7",
                    "August", "Aug.", "Aug", "8", "October", "Oct.", "Oct", "10", "December", "Dec.", "Dec", "12":
                System.out.println("31 days in the month");
                break;
            case "April", "Apr.", "Apr", "4", "June", "Jun.", "Jun", "6", "September", "Sep.", "Sep", "9", "November",
                    "Nov.", "Nov", "11":
                System.out.println("30 days in the month");
                break;
            case "2", "February", "Feb.", "Feb":
                if ((year % 4) != 0) {
                    System.out.println("28 days in the month");
                } else {
                    if ((year % 100) != 0) {
                        System.out.println("29 days in the month");
                    } else if (year % 100 == 0 && year % 400 != 0) {
                        System.out.println("28 days in the month");
                    } else if (year % 400 == 0) {
                        System.out.println("29 days in the month");
                    }
                }
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        System.exit(0);
    }
}