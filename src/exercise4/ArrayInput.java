package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
