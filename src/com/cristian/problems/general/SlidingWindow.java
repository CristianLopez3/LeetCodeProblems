package com.cristian.problems.general;

public class SlidingWindow {
      
  // arr = {5, 2, 3, 0, 1} | k = 3
  public static int slidingWindow() {
    int[] arr = { 5, 2, 3, 0, 11 };
    int k = 3;
    int maxValue = 0;
    int length = arr.length;

    if (length < k) {
      System.out.println("Invalid input");
      return -1;
    }

    // First Window
    for (int i = 0; i < k; i++)
      maxValue += arr[i];

    /**
     * Compute sums of remaining windows by
     * removing first element of previous
     * window and adding last element of
     * current window.
     */
    int window = maxValue;
    for (int i = k; i < length; i++) {
      window += arr[i] - arr[i - k];
      maxValue = Math.max(maxValue, window);
    }

    return maxValue;
  }
}
