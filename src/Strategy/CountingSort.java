package Strategy;

public class CountingSort implements SortingStrategyInterface {

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty array
        }

        // Find the maximum element in the array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Create a counting array to store count of each element
        int[] countArray = new int[max + 1];

        // Store count of each element in the counting array
        for (int num : arr) {
            countArray[num]++;
        }

        // Modify the counting array to store cumulative counts
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Create a temporary array to store sorted elements
        int[] temp = new int[arr.length];

        // Build the sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }

        // Copy elements from temp back to original array
        System.arraycopy(temp, 0, arr, 0, arr.length);
        System.out.println("Sorted array using counting sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

