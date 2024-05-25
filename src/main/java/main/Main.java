package main;

import Algorithms.BubbleSort;

public class Main {

  // Main
  public static void main(String[] args) {

    // Declares an array of integers
    int[] array = { 10, 5, 3, 1, 20, 30 };

    // Bubble Sort
    bubble(array);
  }

  public static void bubble(int[] array) {
    System.out.print("\n+============= Bubble Sort Algorithm =============+");
    System.out.print("\n\nOriginal Array: ");
    for (int n : array) {
      System.out.print(n + " ");
    }

    // Call bubble sort to sort the array
    BubbleSort.sort(array);

    // Display ordered array
    System.out.print("\nOrdered array: ");
    for(int num : array) {
      System.out.print(num + " ");
    }

    System.out.println("\n");
  }
}