package Strategy;

public class QuickSort implements SortingStrategyInterface{

    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int length = arr.length;
        quickSort(arr, 0, length - 1);
        System.out.println("Sorted array using quick sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
