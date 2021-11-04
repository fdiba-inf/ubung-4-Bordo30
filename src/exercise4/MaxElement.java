package exercise4;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        double[] numbers = new double[size];
        double maxElement = -Double.MAX_VALUE;

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            if(numbers[index] > maxElement) {
                maxElement = numbers[index];
            }
        }
        System.out.println("Max number: " + maxElement);
    }
}
