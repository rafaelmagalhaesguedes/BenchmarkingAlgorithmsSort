package algorithms;

public class HeapSort {

  /**
   * Sorts an array of strings using the Heap Sort algorithm.
   *
   * @param array the array of strings to be sorted
   */
  public static void sortArrayStrings(String[] array) {
    int n = array.length;

    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(array, n, i);
    }

    // One by one extract an element from heap
    for (int i = n - 1; i > 0; i--) {
      // Move current root to end
      String temp = array[0];
      array[0] = array[i];
      array[i] = temp;

      // Call max heapify on the reduced heap
      heapify(array, i, 0);
    }
  }

  /**
   * To heapify a subtree rooted with node i which is an index in array[].
   * n is size of heap.
   *
   * @param array the array of strings to be heapified
   * @param n the size of the heap
   * @param i the root index of the subtree to be heapified
   */
  private static void heapify(String[] array, int n, int i) {
    int largest = i; // Initialize largest as root
    int left = 2 * i + 1; // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // If left child is larger than root
    if (left < n && array[left].compareTo(array[largest]) > 0) {
      largest = left;
    }

    // If right child is larger than largest so far
    if (right < n && array[right].compareTo(array[largest]) > 0) {
      largest = right;
    }

    // If largest is not root
    if (largest != i) {
      String swap = array[i];
      array[i] = array[largest];
      array[largest] = swap;

      // Recursively heapify the affected sub-tree
      heapify(array, n, largest);
    }
  }
}

