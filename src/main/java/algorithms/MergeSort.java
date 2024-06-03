package algorithms;

/**
 * The type Merge sort.
 */
public class MergeSort {

  /**
   * Sort strings.
   *
   * @param array the array
   */
  public static void sortStrings(String[] array) {

    if (array.length < 2) {
      return;
    }

    int mid = array.length / 2;
    String[] left = new String[mid];
    String[] right = new String[array.length - mid];

    System.arraycopy(array, 0 , left, 0, mid);
    System.arraycopy(array, mid, right, 0, array.length - mid);

    sortStrings(left);
    sortStrings(right);

    mergeStrings(array, left, right);
  }

  /**
   * Merge strings.
   *
   * @param array the array
   * @param left  the left
   * @param right the right
   */
  public static void mergeStrings(String[] array, String[] left, String[] right) {

    int i = 0, j = 0, k = 0;

    while(i < left.length && j < right.length) {
      if (left[i].compareTo(right[j]) <= 0) {
        array[k++] = left[i++];
      } else {
        array[k++] = right[j++];
      }
    }

    while(i < left.length) {
      array[k++] = left[i++];
    }

    while(j < right.length) {
      array[k++] = right[j++];
    }
  }
}
