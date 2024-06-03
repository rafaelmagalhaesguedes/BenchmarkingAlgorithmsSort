package algorithms;

/**
 * The type Insertion sort.
 */
public class InsertionSort {

  /**
   * Sorts an array of strings using the Insertion Sort algorithm.
   *
   * @param array the array of strings to be sorted
   */
  public static void sortArrayStrings(String[] array) {
    int n = array.length;

    for (int i = 1; i < n; ++i) {
      String key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j].compareTo(key) > 0) {
        array[j + 1] = array[j];
        j = j - 1;
      }

      array[j + 1] = key;
    }
  }
}

