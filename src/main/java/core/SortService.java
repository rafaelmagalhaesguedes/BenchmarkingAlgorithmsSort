package core;

import algorithms.BubbleSort;
import algorithms.MergeSort;
import algorithms.SelectionSort;

/**
 * The type Sort service.
 */
public class SortService {

  /**
   * Bubble sort string.
   *
   * @param array of strings.
   */
  public void bubbleSortString(String[] array) {
    long startTime = System.nanoTime();

    BubbleSort.sortArrayStrings(array);

    long endTime = System.nanoTime();

    long duration = (endTime - startTime) / 1000000;

    System.out.print("\n\nPerforming Bubble Sort...");
    System.out.print("\nBubble Sort duration: " + duration + "/ms");
  }

  /**
   * Merge sort strings.
   *
   * @param array of strings.
   */
  public void mergeSortStrings(String[] array) {
    long startTime = System.nanoTime();

    MergeSort.sortStrings(array);

    long endTime = System.nanoTime();

    long duration = (endTime - startTime) / 1000000;

    System.out.print("\n\nPerforming Merge Sort...");
    System.out.print("\nMerge Sort duration:: " + duration + "/ms");
  }

  public void selectionSortStrings(String[] array) {
    long startTime = System.nanoTime();

    SelectionSort.sortArrayStrings(array);

    long endTime = System.nanoTime();

    long duration = (endTime - startTime) / 1000000;

    System.out.print("\n\nPerforming Selection Sort...");
    System.out.print("\nSelection Sort duration:: " + duration + "/ms");
  }
}
