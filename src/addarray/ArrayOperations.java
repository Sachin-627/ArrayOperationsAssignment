package addarray;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Step 1: Declare the array
        int[] numbers = {10, 25, 7, 42, 15};

        // Step 2: Initialize largest and sum
        int largest = numbers[0];
        int sum = 0;

        // Step 3: Traverse the array
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            sum += num;
        }

        // Step 4: Display results
        System.out.println("Numbers in array: " + Arrays.toString(numbers));
        System.out.println("Largest number: " + largest);
        System.out.println("Sum of elements: " + sum);
    }
}
