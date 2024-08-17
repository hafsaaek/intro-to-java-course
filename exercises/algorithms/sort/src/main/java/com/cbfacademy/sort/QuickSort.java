package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {

    @Override
    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, startIndex, endIndex);

            // Recursively sort the elements before and after the partition
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        // Choose the pivot (last element in the array)
        int pivot = arr[endIndex];
        int i = startIndex - 1; // Boundary for elements less than pivot

        for (int j = startIndex; j < endIndex; j++) {
            // If current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Swap the pivot element with the element at the boundary (i+1)
        swap(arr, i + 1, endIndex);

        // Return the index where the pivot is now placed
        return i + 1;
    }

    private void swap(int[] arr, int index1, int index2) {
        if (index1 != index2) { // Only swap if the indices are different
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}
