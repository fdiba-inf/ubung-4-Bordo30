package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        double[] numbers = new double[size];
        double minElement = Double.MAX_VALUE;
        int minIndex = 0;

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            if(numbers[index] < minElement) {
                minElement = numbers[index];
            }
            if(numbers[index] == minElement) {
                minIndex = index;
            }
        }
        System.out.println("Min index: " + minIndex);
    }
}
