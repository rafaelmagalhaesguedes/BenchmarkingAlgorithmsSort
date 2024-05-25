package Algorithms;

/**
 * The Bubble Sort Algorithm
 */
public class BubbleSort {
  public static void sort(int[] array) {
    // Gets the size of the array
    int size = array.length;

    // Outer loop iterates over each element of the array except the last
    for(int i = 0; i < size - 1; i++) {
      // Inner loop that iterates over the remaining unsorted elements
      for(int j = 0; j < size - i - 1; j++) {
        // Checks if the current element is greater than the next element
        if (array[j] > array[j + 1]) {
          // Temporarily stores the current element
          int temp = array[j];
          // Replaces the current element with the next element
          array[j] = array[j + 1];
          // Replaces the next element with the stored temporary value
          array[j + 1] = temp;
        }
      }
    }
  }
}
