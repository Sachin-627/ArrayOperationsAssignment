# ArrayOperationsAssignment
This repository contains Java programs for basic array operations and other beginner-level assignments. The main program in this repository demonstrates how to:  Find the largest number in a given array.  Calculate the sum of all elements in the array.  The program uses simple array traversal and basic Java concepts.
# Java Assignment: Largest Number and Sum of Array Elements

## Aim
To write a Java program to find the largest number and calculate the sum of elements in a given array.

## Algorithm
1. Start the program.  
2. Declare an integer array with given numbers.  
3. Initialize `largest` with the first element and `sum` as 0.  
4. Traverse the array:  
   - If the current element is greater than `largest`, update `largest`.  
   - Add the current element to `sum`.  
5. Display the largest number and sum of elements.  
6. End the program.  

## Program

```java
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
