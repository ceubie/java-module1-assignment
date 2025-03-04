import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/// Input an Array: The program should prompt the user to input 5 integers, store them in an array,
/// and print the array.
///
/// Reverse the Array: Reverse the array and print it.
///
/// Find the Maximum and Minimum Values: Find the largest and smallest numbers in the array and print them.
/// You should be running this process manually and not using a built-in method to give you the answer.
///
/// Sum of the Array: Calculate the sum of all the numbers in the array and print the result.
///
/// Check for an Even Number: Check if the array contains any even number, and print a message based on the result.


public class ArrayObjective {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner
        int[] nums = new int[5]; //create array

        // Based on user input, assign values to 'nums' array for indices 0-4
        System.out.print("Enter the first digit for your array: ");
        nums[0] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the second digit for your array: ");
        nums[1] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the third digit for your array: ");
        nums[2] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the fourth digit for your array: ");
        nums[3] = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the fifth digit for your array: ");
        nums[4] = scanner.nextInt();

        System.out.println("Here is your array: " + Arrays.toString(nums));

        scanner.close(); // close scanner

        // create empty ArrayList that can be appended during the iterations of the following for loop
        ArrayList<Integer> reverseOrder = new ArrayList<Integer>();

        // for loop working backwards from final index to 0th index
        for(int i = (nums.length - 1); i >= 0; i--){
            reverseOrder.add(nums[i]);
        }
        System.out.println("Here is the reversed version of your array: " + reverseOrder); // print reversed array


        int min = nums[0]; // set value to 0th index for effective comparison in for loop 1
        int max = nums[0]; // set value to 0th index for effective comparison in for loop 2

        for (int num : nums) {  // for loop 1 compares numbers in 'nums' to find smallest value in array
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The smallest number in your array is: " + min);

        for(int i = 0; i < nums.length; i++){   // for loop 2 compares numbers in 'nums' to find largest value in array
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("The largest number in your array is: " + max);

        int sum = Arrays.stream(nums).sum();
        System.out.println("The sum of the numbers in your array is: " + sum);

        int counter = 0;        // counter tracks how many even numbers are present in 'nums' array
        for(int num : nums){
            if(num % 2 == 0){   // if number is even, dividing by two gives no remainder
                counter += 1;
            }
        }
        if(counter > 0){
            System.out.println("There is at least one even number in your array!");
        } else System.out.println("There are no even numbers in your array.");


    }
}
