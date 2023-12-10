package Strategy;

public class MergeSort implements SortingStrategyInterface {


    private void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid); // Sort left half
            mergeSort(arr, temp, mid + 1, right); // Sort right half
            merge(arr, temp, left, mid, right); // Merge both halves
        }
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i]; // Copy elements to temp array
        }

        int i = left; // Initial index of first subarray
        int j = mid + 1; // Initial index of second subarray
        int k = left; // Initial index of merged subarray

        // Merge the temp arrays
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left subarray
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    @Override
    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
        System.out.println("Sorted array using merge sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

