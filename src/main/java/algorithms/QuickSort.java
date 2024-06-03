package algorithms;

public class QuickSort {

  /**
   * Public method to start sorting using Quick Sort.
   *
   * @param array the array of strings to be sorted
   */
  public static void sortArrayStrings(String[] array) {
    quickSort(array, 0, array.length - 1);
  }

  /**
   * Private method to perform sorting using Quick Sort recursively.
   *
   * @param array the array of strings to be sorted
   * @param low the starting index of the subarray
   * @param high the ending index of the subarray
   */
  private static void quickSort(String[] array, int low, int high) {
    if (low < high) {
      // Partition the array and get the index of the pivot
      int pivotIndex = partition(array, low, high);

      // Sort the elements before and after the pivot recursively
      quickSort(array, low, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, high);
    }
  }

  /**
   * Private method to partition the array around a pivot.
   *
   * @param array the array of strings to be partitioned
   * @param low the starting index of the subarray
   * @param high the ending index of the subarray
   * @return the index of the pivot
   */
  private static int partition(String[] array, int low, int high) {
    // Select the pivot (last element of the subarray)
    String pivot = array[high];
    int i = low - 1;

    // Traverse the subarray and rearrange the elements smaller than the pivot
    for (int j = low; j < high; j++) {
      if (array[j].compareTo(pivot) < 0) {
        i++;
        swap(array, i, j);
      }
    }

    // Place the pivot in the correct position
    swap(array, i + 1, high);
    return i + 1;
  }

  /**
   * Private method to swap two elements in an array.
   *
   * @param array the array of strings
   * @param i the index of the first element
   * @param j the index of the second element
   */
  private static void swap(String[] array, int i, int j) {
    String temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}



