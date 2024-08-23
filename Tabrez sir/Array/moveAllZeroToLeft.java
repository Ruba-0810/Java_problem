import java.util.*;

class p1 {
    // Method to move all zeros to the left and shift non-zero elements to the right
    public static void movetoleft(int[] arr) {
        int n = arr.length;
        int count = n - 1; // Position to place the next zero
        
        // Move from right to left to gather non-zero elements
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count--;
            }
        }
        
        // Fill the remaining positions with zeros
        while (count >= 0) {
            arr[count] = 0;
            count--;
        }
        
        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] arr = {8, 2, 0, 1, 4, 1, 0, 5, 1, 2, 0, 1};
        movetoleft(arr);
    }
}
