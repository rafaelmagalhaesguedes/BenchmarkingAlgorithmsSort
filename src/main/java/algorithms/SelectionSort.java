package algorithms;

/**
 * The type Selection sort.
 */
public class SelectionSort {

  /**
   * Sort.
   *
   * @param array the array
   */
  public static void sortArrayStrings(String[] array) {
    int n = array.length;

    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j].compareTo(array[minIndex]) < 0) {
          minIndex = j;
        }
      }

      String temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }
  }
}


