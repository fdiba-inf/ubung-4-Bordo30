package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        char[] symbols = new char[size];
        char[] reversed = new char[symbols.length];

        System.out.println("Enter symbols: ");
        for (int index = 0; index < symbols.length; index++) {
            symbols[index] = input.next().charAt(0);
            reversed[symbols.length - index - 1] = symbols[index];
        }
        System.out.println("Reversed symbols: " + Arrays.toString(reversed));

    }
}
