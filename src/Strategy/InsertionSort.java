package Strategy;

public class InsertionSort implements SortingStrategyInterface{

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty array
        }

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array using Insertion sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

