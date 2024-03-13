import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array's length: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            System.out.println("Enter the element at index " + j + ":");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = Integer.toString(array[i]);
        }

        Arrays.sort(stringArray);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(stringArray));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
    }
}