package core;

import algorithms.BubbleSort;
import algorithms.HeapSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;

/**
 * The type Sort service.
 */
public class SortService {

  /**
   * Sorts the array using different sorting algorithms and prints the duration.
   *
   * @param array of strings.
   */
  public void sortAndPrintDurations(String[] array) {
    String[] itemsForBubbleSort = array.clone();
    String[] itemsForSelectionSort = array.clone();
    String[] itemsForInsertionSort = array.clone();
    String[] itemsForQuickSort = array.clone();
    String[] itemsForMergeSort = array.clone();
    String[] itemsForHeapSort = array.clone();

    long bubbleSortDuration = measureSortTime(() -> BubbleSort.sortArrayStrings(itemsForBubbleSort));
    long selectionSortDuration = measureSortTime(() -> SelectionSort.sortArrayStrings(itemsForSelectionSort));
    long insertionSortDuration = measureSortTime(() -> InsertionSort.sortArrayStrings(itemsForInsertionSort));
    long quickSortDuration = measureSortTime(() -> QuickSort.sortArrayStrings(itemsForQuickSort));
    long mergeSortDuration = measureSortTime(() -> MergeSort.sortStrings(itemsForMergeSort));
    long heapSortDuration = measureSortTime(() -> HeapSort.sortArrayStrings(itemsForHeapSort));

    long[] durations = {
        bubbleSortDuration,
        selectionSortDuration,
        insertionSortDuration,
        quickSortDuration,
        mergeSortDuration,
        heapSortDuration
    };

    String[] algorithms = {
        "Bubble Sort",
        "Selection Sort",
        "Insertion Sort",
        "Quick Sort",
        "Merge Sort",
        "Heap Sort"
    };

    sortDurationsAndPrintResults(durations, algorithms);
  }

  /**
   * Measures the duration of the given sort operation.
   *
   * @param sortOperation the sort operation.
   * @return the duration in milliseconds.
   */
  private long measureSortTime(Runnable sortOperation) {
    long startTime = System.nanoTime();

    sortOperation.run();

    long endTime = System.nanoTime();

    return (endTime - startTime) / 1000000;
  }

  /**
   * Sorts the durations and prints the results.
   *
   * @param durations the durations.
   * @param algorithms the algorithms.
   */
  private void sortDurationsAndPrintResults(long[] durations, String[] algorithms) {
    int n = durations.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (durations[j] > durations[j + 1]) {
          long tempDuration = durations[j];
          durations[j] = durations[j + 1];
          durations[j + 1] = tempDuration;

          String tempAlgorithm = algorithms[j];
          algorithms[j] = algorithms[j + 1];
          algorithms[j + 1] = tempAlgorithm;
        }
      }
    }

    System.out.println("\n\n+================= Sorting Algorithm Performance ===================+\n");
    for (int i = 0; i < n; i++) {
      System.out.printf("-> %s duration: %d ms\n\n", algorithms[i], durations[i]);
    }
  }
}
